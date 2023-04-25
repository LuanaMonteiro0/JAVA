package Exercicios.Ead1.palindromos;

import java.util.Scanner;

public class Main {
    public static boolean isPalindromo(String palavra){
        String palavraRevertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(palavraRevertida);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isPali = isPalindromo(input);
        if(isPali)
            System.out.println("Sim");
        else
            System.out.println("Nao");

    }
}
