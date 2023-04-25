package Exercicios.ListaDois.SobrinhaCentenaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double maiorAltura = 0;
        int qtdeVezesMaiorAltura = 0;
        int idade = entrada.nextInt();

        while (idade > 0 ) {
            double alturaVela = entrada.nextDouble();
            if (alturaVela > maiorAltura) {
                maiorAltura = alturaVela;
                qtdeVezesMaiorAltura = 1;
            }
            else if (alturaVela == maiorAltura){
                qtdeVezesMaiorAltura++;
            }
            idade--;
        }
        System.out.println(qtdeVezesMaiorAltura);
    }
}
