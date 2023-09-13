package br.com.bytebank.composto.test;

import br.com.bytebank.composto.modelo.Cliente;
import br.com.bytebank.composto.modelo.Conta;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaBibi  = new Conta();
        System.out.println(contaDaBibi.getSaldo());
        contaDaBibi.titular = new Cliente();
        System.out.println(contaDaBibi.titular);
        contaDaBibi.titular.nome = "Bibi";
        System.out.println(contaDaBibi.titular.nome);
    }
}