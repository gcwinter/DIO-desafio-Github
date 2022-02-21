package br.com.gabriel.dio;

public class Mensagem {



    public void mensagem(double hora) {

        if(hora>5&& hora<=12){
            System.out.println("Bom dia agora é : " + hora);
        }else if(hora<=17 && hora >12){
            System.out.println("Boa tarde agora é : " + hora);
        }else if(hora >=0 && hora <5 || hora >17 && hora<=24){
            System.out.println("Boa noite agora é : " + hora);
        }


    }
}
