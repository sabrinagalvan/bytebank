package br.com.bytebank.herdado.conta.test;

import br.com.bytebank.herdado.conta.modelo.Cliente;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        //int[] idades = new int[5];
        Object[] referencias = new Object[5];
        System.out.println(referencias.length);
        ContaCorrente cc1 = new ContaCorrente(11, 22);
        referencias[0] = cc1;
        ContaPoupanca cc2 = new ContaPoupanca(33, 44);
        referencias[1] = cc2;
        Cliente cliente = new Cliente();
        referencias[2] = cliente;
        //System.out.println(cc2.getNumero());

//        Object referenciaGenerica = referencias[1];

//        System.out.println(referenciaGenerica.getNumero());
        ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}