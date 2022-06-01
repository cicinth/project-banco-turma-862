package model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Cliente {
    public String nome;
    public Long rg;
    public LocalDate dataNascimento;
    public Long cpf;
    public Conta conta;

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(){}

    public  Cliente(String nome, Long rg, LocalDate dataNascimento, Long cpf){
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public void criarConta(Enum<TipoConta> tipoConta, Long numeroConta, int agencia){
       Conta conta = new Conta();
       conta.tipoConta = tipoConta;
       conta.numeroConta = numeroConta;
       conta.agencia = agencia;
       conta.saldo = BigDecimal.ZERO;
       this.conta = conta;

    }
}
