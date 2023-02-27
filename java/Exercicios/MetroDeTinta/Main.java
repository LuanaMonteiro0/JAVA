package Exercicios.MetroDeTinta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double finalValue;
        double L = leitor.nextDouble();
        double A = leitor.nextDouble();
        double C = leitor.nextDouble();
        double M = leitor.nextDouble();
        if (L > 0 && A > 0 && C > 0 && M > 0){
            double wall = L * A;
            double waste = Math.round(wall / M);
            finalValue = waste * C;
        }
        else finalValue = 00.00;
        System.out.println(finalValue);



    }
}
