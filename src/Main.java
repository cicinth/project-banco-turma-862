import model.Cliente;
import model.Conta;
import model.TipoConta;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args){
        Conta conta = new Conta(TipoConta.CONTA_CORRENTE, 123456L, 1234);
        conta.deposita(BigDecimal.valueOf(8));
        conta.deposita(BigDecimal.valueOf(10));
        conta.saque(BigDecimal.valueOf(7));

        Conta contaPoupanca = new Conta(TipoConta.CONTA_POUPANCA, 12654l, 1023);
        conta.transferencia(BigDecimal.valueOf(5), contaPoupanca);
        System.out.println("O saldo da minha conta poupança é: " + contaPoupanca.getSaldo());

        Cliente cliente = new Cliente("Will");
        cliente.setCpf(12345678911L);
        cliente.setConta(conta);

        System.out.println("O cliente " + cliente.getNome()+ " tem o cpf: " +
                cliente.getCpf() + " e a conta: " + cliente.getConta().getNumeroConta() +
                " com saldo: " + cliente.getConta().getSaldo());
    }

}
