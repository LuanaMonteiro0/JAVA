package Exercicios.ListaDois.ConstrucaoVetores;

import java.util.Scanner;

public class Main {
    public static void printArray(long[] array, int qntItens){
        for (int i = 0; i < qntItens; i++) {
            if (i != 0){
                System.out.print(", " + array[i]);
            }else{
                System.out.print(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        final int ARRAYSIZE = 5;
        final int[] vetorA = new int[ARRAYSIZE];
        final int[] vetorB = new int[ARRAYSIZE];
        final long[] vetorC = new long[ARRAYSIZE];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < ARRAYSIZE; i++){
            vetorA[i] = leitor.nextInt();
        }
        for (int i = 0; i < ARRAYSIZE; i++){
            vetorB[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = (long)vetorA[i] + vetorB[i];
        }
    printArray(vetorC, ARRAYSIZE);


    }
}
