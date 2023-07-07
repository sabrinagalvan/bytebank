package br.com.bytebank.herdado.test;

import br.com.bytebank.herdado.modelo.Autenticavel;
import br.com.bytebank.herdado.modelo.Cliente;
import br.com.bytebank.herdado.modelo.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Autenticavel referencia = new Cliente();
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("333.333.333-33");
        g1.setSalario((5000.0));
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());
    }
}