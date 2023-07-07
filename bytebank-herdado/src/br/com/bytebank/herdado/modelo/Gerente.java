package br.com.bytebank.herdado.modelo;

//modelo.Gerente eh um modelo.Funcionario, modelo.Gerente herda da class modelo.Funcionario, assina o contrato modelo.Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
    private AutenticacaoUtil autenticador;
    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
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