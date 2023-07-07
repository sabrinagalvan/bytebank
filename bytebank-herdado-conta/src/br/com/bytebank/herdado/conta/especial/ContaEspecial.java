package br.com.bytebank.herdado.conta.especial;

import br.com.bytebank.herdado.conta.modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

}
