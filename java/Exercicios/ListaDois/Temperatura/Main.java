package Exercicios.ListaDois.Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int[] temperaturas = new int[7];
        int soma = 0;
        int acimaMedia = 0;
        for (int i = 0; i < 7; i++) {
            temperaturas[i] = leitor.nextInt();
            soma += temperaturas[i];
        }
        double media = (double) soma / 7;
        for (int i : temperaturas) {
            if (i > media) {
                acimaMedia++;
            }

        }
        System.out.println(acimaMedia);
    }
}
