package br.com.gabriel.dio;


public class rodarExercicio {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.soma(10, 20);
        calc.subtracao(20, 10);
        calc.multiplicacao(10, 50);
        calc.dividir(20, 50);

        Mensagem mensagem = new Mensagem();
        mensagem.mensagem(15);
        mensagem.mensagem(19);
        mensagem.mensagem(22);
        mensagem.mensagem(1);
        mensagem.mensagem(9.3);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.caulcular(5, 1000);
        emprestimo.caulcular(10, 1000);
        emprestimo.caulcular(24, 1000);
        emprestimo.caulcular(36, 1000);

    }
}