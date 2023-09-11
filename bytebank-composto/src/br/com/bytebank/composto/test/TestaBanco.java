package br.com.bytebank.composto.test;

import br.com.bytebank.composto.modelo.Cliente;
import br.com.bytebank.composto.modelo.Conta;

public class TestaBanco {

    public static void main(String[] arg) {

        Cliente paulo = new Cliente();
        paulo.nome = "Sabrina Galvan";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDaSabrina = new Conta();
        contaDaSabrina.deposita(100);

        //associa o cliente paulo a conta contaDaSabrina
        contaDaSabrina.titular = sabrina;
        System.out.println(contaDaSabrina.titular.nome);
        System.out.println(contaDaSabrina.titular);
        System.out.println(paulo);
    }
}