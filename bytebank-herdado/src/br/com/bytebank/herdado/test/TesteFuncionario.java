package br.com.bytebank.herdado.test;

import br.com.bytebank.herdado.modelo.Cliente;
import br.com.bytebank.herdado.modelo.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("222.222.222-22");
        nico.setSalario(2600.00);
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
//        nico.salario = 300.0;
    }
}