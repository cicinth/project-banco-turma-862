package model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Enum<TipoConta> tipoConta, Long numeroConta, Integer agencia) {
      super(tipoConta, numeroConta, agencia);
    }

    public ContaPoupanca(Long numeroConta, Integer agencia){
        super(numeroConta, agencia);
    }
    public void renderJuros(double taxa){
        super.saldo = super.saldo.multiply(BigDecimal.valueOf(taxa));
    }

    public BigDecimal deposita(BigDecimal valor) {
        BigDecimal novoValor = valor.multiply(BigDecimal.valueOf(1.10));
        super.saldo = super.saldo.add(novoValor);
        return super.saldo;
    }
}
