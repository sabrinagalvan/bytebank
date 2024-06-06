package br.com.bytebank.herdado.modelo;
//contrato modelo.Autenticavel
    //quem assinar esse contrato, precisa implementar
    //metodo setSenha
    //metodo autentica
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);

}
