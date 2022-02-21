package br.com.gabriel.dio;

public class Calculadora {


    public void soma(double valorA,double valorB){
        System.out.println("a soma de " + valorA + " + " + valorB + " é :" + (valorA+valorB));

    }
    public void subtracao(double valorA,double valorB){
        System.out.println("a subtração de " + valorA + " - " + valorB + " é :" + (valorA-valorB));

    }

    public void multiplicacao(double valorA,double valorB){
        System.out.println("a multiplicação de " + valorA + " * " + valorB  +" é :" + (valorA*valorB));

    }
    public void dividir(double valorA,double valorB){
        System.out.println("a divisão de " + valorA + " / " + valorB + " é :" + (valorA/valorB));

    }

}
