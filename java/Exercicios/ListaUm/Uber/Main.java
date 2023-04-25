package Exercicios.Uber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double x, v1, v2, a, resp;
        x = leitor.nextDouble();
        v1 = leitor.nextDouble();
        v2 = leitor.nextDouble();
        a = leitor.nextDouble();
        resp = a<=x?v1*a:v2*a;
        System.out.printf("%.2f", resp);
    }
}
