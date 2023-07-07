package br.com.bytebank.herdado.test;

import br.com.bytebank.herdado.modelo.Admisnitrador;
import br.com.bytebank.herdado.modelo.Cliente;
import br.com.bytebank.herdado.modelo.Gerente;
import br.com.bytebank.herdado.modelo.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);
        Admisnitrador adm = new Admisnitrador();
        adm.setSenha(3333);
        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
    }
}