package br.com.bytebank.herdado.conta.modelo;

public class SeguroDeVida implements Tributavel{
    @Override
    public double getValorImposto() {
        return 42;
    }
}