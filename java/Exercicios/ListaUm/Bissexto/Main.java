package Exercicios.Bissexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int ano = leitor.nextInt();
        String resposta;
        if(ano > 0){
            resposta = ano%400==0?"Ano bissexto":((ano%4==0) && (ano%100!=0)?"Ano bissexto":"Ano nao bissexto");
        }
        else
            resposta = "erro";
        System.out.println(resposta);
    }
}
