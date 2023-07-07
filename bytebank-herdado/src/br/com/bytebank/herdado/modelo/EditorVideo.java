package br.com.bytebank.herdado.modelo;

//modelo.Gerente eh um modelo.Funcionario, modelo.Gerente herda da class modelo.Funcionario
public class EditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do EDITOR DE VÍDEO");
        return 150;
    }
}