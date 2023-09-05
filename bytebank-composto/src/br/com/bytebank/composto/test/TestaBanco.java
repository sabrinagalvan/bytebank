package br.com.bytebank.composto.test;

import br.com.bytebank.composto.modelo.Cliente;
import br.com.bytebank.composto.modelo.Conta;

public class TestaBanco {

    public static void main(String[] arg) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";
        Conta contaDopaulo = new Conta();
        contaDopaulo.deposita(100);
        //associa o cliente paulo a conta contaDoPaulo
        contaDopaulo.titular = paulo;
        System.out.println(contaDopaulo.titular.nome);
        System.out.println(contaDopaulo.titular);
        System.out.println(paulo);
    }
}