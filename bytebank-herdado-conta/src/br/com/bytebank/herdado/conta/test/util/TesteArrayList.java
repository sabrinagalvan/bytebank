package br.com.bytebank.herdado.conta.test.util;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        //generics
        List<Conta> lista = new ArrayList<>();
        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(55, 66);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(77, 88);
        lista.add(cc4);
        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());
        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("--------------------------------------");
        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}