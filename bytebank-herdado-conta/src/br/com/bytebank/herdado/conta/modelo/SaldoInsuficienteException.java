package br.com.bytebank.herdado.conta.modelo;

public class  SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}