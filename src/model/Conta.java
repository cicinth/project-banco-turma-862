package model;
import java.math.BigDecimal;

public class Conta {
    public Enum<TipoConta> tipoConta;
    public Long numeroConta;
    public Integer agencia;
    public BigDecimal saldo;
    
    public BigDecimal deposita(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }
}

