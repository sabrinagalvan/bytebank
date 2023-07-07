package br.com.bytebank.herdado.conta.test.util;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {
    public static void main(String[] args) {
//        Conta cc1 = new ContaCorrente(22, 22);
//        Conta cc2 = new ContaCorrente(22, 22);

//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);
        //generics
        List<Conta> lista = new ArrayList<Conta>();
        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(33, 44);
        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? " + existe);
        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}