package br.com.bytebank.herdado.modelo;

//modelo.Gerente eh um modelo.Funcionario, modelo.Gerente herda da class modelo.Funcionario
public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do DESIGNER");
        return 200;
    }

}
