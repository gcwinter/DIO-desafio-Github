package br.com.gabriel.dio;

public class Emprestimo {


    public  double taxa(int numeroDeParcelas){

        return numeroDeParcelas*0.5/100;


    }

    public  void caulcular(int numeroDeParcelas,double valor){

        System.out.println("com " + numeroDeParcelas +
                " parcelas, o valor total para o emprestimo de R$" +
                valor + " é de : R$" + (valor*Math.pow((1+taxa(numeroDeParcelas)),numeroDeParcelas)));


    }
}
