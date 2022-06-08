package model;

import java.math.BigDecimal;

public class Conta {
    protected Long numeroConta;
    protected Integer agencia;
    protected BigDecimal saldo;

    public Conta(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = BigDecimal.ZERO;
    }

    public Conta(Long numeroConta, Integer agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = BigDecimal.ZERO;
    }


    public Long getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Integer agencia){
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;

    }

    public BigDecimal deposita(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }

    public BigDecimal saque(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
        return this.saldo;
    }

    public BigDecimal transferencia(BigDecimal valor, Conta destino) {
        BigDecimal saldoAtualizadoDaContaOrigem = saque(valor);
        destino.deposita(valor);
        return saldoAtualizadoDaContaOrigem;
    }

}

