package Exercicios.livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String resposta;
        Scanner leitor = new Scanner(System.in);
        int livro = leitor.nextInt();
        if(livro > 0) {
            double critA = 0.25 * livro + 7.5;
            double critB = 0.5 * livro + 2.5;
            resposta = critA == critB? "Indiferente":critA < critB ? "Criterio A" : "Criterio B";
        }
        else
            resposta = "Erro";

        System.out.println(resposta);
    }
}
