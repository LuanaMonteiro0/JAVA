package Exercicios.ListaUm.Algoritmopolis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double resposta;
        int L = leitor.nextInt();
        double M = leitor.nextDouble();
        double A = leitor.nextDouble();
        int V = leitor.nextInt();
        int variacao = V - L;
        if(variacao > 0){
            double multa = M + (A * variacao);
            resposta = Math.round(multa * 100.00)/100.00;
        }
        else
            resposta = 0.00;

        System.out.printf("%.2f",resposta);
    }
}

