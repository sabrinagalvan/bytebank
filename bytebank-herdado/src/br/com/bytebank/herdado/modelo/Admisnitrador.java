package br.com.bytebank.herdado.modelo;

public class Admisnitrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Admisnitrador() {
      this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
