package Exercicios.ListaDois.VendaPelaWeb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double h = leitor.nextDouble();
        double l = leitor.nextDouble();
        double config1 = a * b;
        double config2 = a * c;
        double config3 = c * b;
        double janela = h * l;
        if(janela >= config1 || janela >= config2 ||janela >= config3)
            System.out.println("S");
        else
            System.out.println("N");

    }
}
