package Exercicios.Ead1.Anagramas;

import java.util.Scanner;

public class Main {
    public static String reversor(String palavra){
        return new StringBuilder(palavra).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra1rev = reversor(palavra1);
        String palavra2rev = reversor(palavra2);
        if(palavra1.equals(palavra2rev)||palavra2.equals(palavra1rev))
            System.out.println("Sim");
        else
            System.out.println("Nao");
    }
}
