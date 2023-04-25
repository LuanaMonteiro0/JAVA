package Exercicios.ListaUm.MetroDeTinta;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double finalValue;
        double waste = 0.0;
        double L = leitor.nextDouble();
        double A = leitor.nextDouble();
        double C = leitor.nextDouble();
        double M = leitor.nextDouble();
        if (L > 0 && A > 0 && C > 0 && M > 0){
            double wall = L * A;
            waste = Math.ceil(wall / M);
            finalValue = waste * C;
        }
        else finalValue = 0.00;
        int wasteInt = (int) waste;
        System.out.println(wasteInt);
        System.out.printf("%.2f", finalValue);
    }
}
