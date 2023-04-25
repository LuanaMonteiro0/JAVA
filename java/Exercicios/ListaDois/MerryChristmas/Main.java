package Exercicios.ListaDois.MerryChristmas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int presentes = leitor.nextInt();
        double somaLadoA = 0;
        double somaLadoB = 0;
        int count = 0;
        while(count < presentes){
            double presente = leitor.nextDouble();
            if(somaLadoA < somaLadoB)
                somaLadoA += presente;
            else
                somaLadoB += presente;
            count++;
        }
        if(Math.abs(somaLadoA-somaLadoB) < 5) // pega valor sem positivo ou negativo
            System.out.println("S");
        else
            System.out.println("N");
    }
}
