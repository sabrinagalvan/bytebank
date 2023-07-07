package br.com.bytebank.herdado.conta.test;

import br.com.bytebank.herdado.conta.modelo.Conta;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;
import br.com.bytebank.herdado.conta.modelo.GuardadorDeContas;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();
        Conta cc1 = new ContaCorrente(11, 22);
        guardador.adiciona(cc1);
        Conta cc2 = new ContaCorrente(33, 44);
        guardador.adiciona(cc2);
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);
        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}