package br.com.bytebank.test;

import br.com.bytebank.modelo.Conta;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDaSabrina = new Conta();
        contaDaSabrina.saldo = 100;
        contaDaSabrina.deposita(50);
        System.out.println(contaDaSabrina.saldo);

        boolean conseguiuRetirar = contaDaSabrina.saca(20);
        System.out.println(contaDaSabrina.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        if(contaDaMarcela.transfere(3000, contaDaSabrina)) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

        System.out.println(contaDaMarcela.saldo);

        System.out.println(contaDaSabrina.saldo);

        contaDaSabrina.titular = "paulo silveira";
        System.out.println(contaDaSabrina.titular);

    }
}