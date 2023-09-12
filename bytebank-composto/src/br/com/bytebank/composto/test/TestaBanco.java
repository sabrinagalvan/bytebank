package br.com.bytebank.composto.test;

import br.com.bytebank.composto.modelo.Cliente;
import br.com.bytebank.composto.modelo.Conta;

public class TestaBanco {

    public static void main(String[] arg) {

        Cliente sabrina = new Cliente();
        sabrina.nome = "Sabrina Galvan";
        sabrina.cpf = "222.222.222-22";
        sabrina.profissao = "programador";

        Conta contaDaSabrina = new Conta();
        contaDaSabrina.deposita(100);

        //associa o cliente paulo a conta contaDaSabrina
        contaDaSabrina.titular = sabrina;
        System.out.println(contaDaSabrina.titular.nome);
        System.out.println(contaDaSabrina.titular);
        System.out.println(sabrina);

    }
}