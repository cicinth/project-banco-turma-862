import model.Cliente;
import model.Conta;
import model.TipoConta;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        Cliente cliente = criarCliente();

        System.out.println(cliente.nome);
//        BigDecimal saldoAtual = cliente.conta.deposita(BigDecimal.valueOf(10));
//
//        System.out.println("O saldo do cliente "+ cliente.nome +" é de " + saldoAtual);
    }

    public static Cliente criarCliente(){
        Cliente cliente = new Cliente();

       return cliente;
    }

}
