package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private Long rg;
    private LocalDate dataNascimento;
    private Long cpf;
    private ArrayList<Conta> contas;


    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(String nome, Long rg, LocalDate dataNascimento, Long cpf) {
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.contas = new ArrayList();
    }

    public Conta criarConta() {
        Conta conta = new Conta(TipoConta.CONTA_CORRENTE, 123468l, 1254);
        this.contas.add(conta);
        return conta;
    }

    //Obtem o valor de nome (get - getter)
    public String getNome() {
        return this.nome;
    }

    //Altera o valor de nome (set - setter)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRg() {
        return this.rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public Long getCpf() {
        return this.cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Conta> getConta() {
        return this.contas;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }

    public ContaCorrente getContaCorrente(){
        for(int i = 0; i < this.contas.size(); i++){
            if(this.contas.get(i).tipoConta == TipoConta.CONTA_CORRENTE){
                return (ContaCorrente) contas.get(i);
            }
        }
        return new ContaCorrente();
    }
}
