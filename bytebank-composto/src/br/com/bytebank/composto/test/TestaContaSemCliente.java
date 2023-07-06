package br.com.bytebank.composto.test;

import br.com.bytebank.composto.modelo.Cliente;
import br.com.bytebank.composto.modelo.Conta;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela  = new Conta();
        System.out.println(contaDaMarcela.getSaldo());
        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}