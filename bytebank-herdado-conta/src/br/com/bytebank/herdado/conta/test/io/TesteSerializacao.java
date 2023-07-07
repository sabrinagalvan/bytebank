package br.com.bytebank.herdado.conta.test.io;

import br.com.bytebank.herdado.conta.modelo.Cliente;
import br.com.bytebank.herdado.conta.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Sabrina");
        cliente.setProfissao("Scroll Master");
        cliente.setCpf("12345678900");
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}