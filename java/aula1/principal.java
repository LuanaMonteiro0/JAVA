package aula1;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        //entrada e saida exemplo
        Scanner scanner = new Scanner(System.in); //ctrl alt v auto completa com o lado esquerdo da variavel
        System.out.println("DIGITE SEU NOME"); //se tirar o ln ele scanneia na frente
        String input = scanner.nextLine();
        System.out.println("Olá, " + input);

    }

}
