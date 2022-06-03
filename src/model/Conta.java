package model;

import java.math.BigDecimal;

public class Conta {
    private Enum<TipoConta> tipoConta;
    private Long numeroConta;
    private Integer agencia;
    private BigDecimal saldo;

    public Conta(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = BigDecimal.ZERO;
    }

    public Enum<TipoConta> getTipoConta() {
        return this.tipoConta;
    }

    public Long getNumeroConta() {
        return this.numeroConta;
    }

    public Integer getAgencia() {
        return this.agencia;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public BigDecimal deposita(BigDecimal valor) {
        BigDecimal novoValor = valor.multiply(BigDecimal.valueOf(1.10));
        this.saldo = this.saldo.add(novoValor);
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

