package Exercicios.ListaUm.Idades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int contador =0;
        int somaTotal = 0;
        int maiorIdade = 0;
        int idosos = 0;
        int idade = leitor.nextInt();
        while(idade>=0){
            contador++;
            somaTotal += idade;
            if(idade >= 18)
                maiorIdade++;
            if(idade > 75)
                idosos++;

            idade = leitor.nextInt();
        }
        double mediaIdades = (double)somaTotal/contador;
        double porcentIdosos = (double)idosos * 100/contador ;
        System.out.printf("%.2f %n", mediaIdades);
        System.out.println(maiorIdade);
        System.out.printf("%.2f", porcentIdosos);
        System.out.println("%");
    }
}
