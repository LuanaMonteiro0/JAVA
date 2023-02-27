package Exercicios.Chocolate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double N = leitor.nextDouble();
        int C = leitor.nextInt();
        int M = leitor.nextInt();
        double ChocoComprado = Math.floor(N/C);
        double ChocoTrocado = Math.floor(ChocoComprado/M);
        double ChocoTotal = ChocoComprado + ChocoTrocado;
        int resposta = (int) ChocoTotal;
        System.out.println(resposta);
    }
}
