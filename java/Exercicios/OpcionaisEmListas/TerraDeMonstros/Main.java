package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuncoesFrequentes funcoes = new FuncoesFrequentes();
        System.out.println("Você acorda em um mundo pós apocaliptico, sendo um:\n 1 - vampiro\n 2 - Lobisomem \n 3 - Humano");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Você escolheu ser um vampiro!");
                Monstro voce = funcoes.askForNewVampire();

            }
            case 2 -> {
                System.out.println("Você escolheu ser um Lobisomem!");
                Monstro voce = funcoes.askForNewWolf();
            }
            case 3 -> {
                System.out.println("Sabia escolha, você escolheu ser um humano!");
            }
            default -> System.out.println("Você não quer jogar? Tudo bem então");
        }
    }
}
