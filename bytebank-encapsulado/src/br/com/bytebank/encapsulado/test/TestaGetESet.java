package br.com.bytebank.encapsulado.test;

import br.com.bytebank.encapsulado.modelo.Cliente;
import br.com.bytebank.encapsulado.modelo.Conta;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getNumero());
        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("paulo silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("programador");
        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}