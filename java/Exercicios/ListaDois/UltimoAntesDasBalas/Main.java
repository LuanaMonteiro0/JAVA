package Exercicios.ListaDois.UltimoAntesDasBalas;

import java.util.Scanner;

public class Main {
    public static void printArray(int[] array, int qntItens){
        for (int i = 0; i < qntItens; i++) {
            if (i != 0){
                System.out.print(" " + array[i]);
            }else{
                System.out.print(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanhoNumeros = entrada.nextInt();
        int indiceElemento;
        int tamanhoVetorC = tamanhoNumeros * 2;
        int[] vetorC = new int[tamanhoVetorC];
        for (indiceElemento = 0; indiceElemento < tamanhoVetorC; indiceElemento += 2){
            int elementoVetorA = entrada.nextInt();
            vetorC[indiceElemento] = elementoVetorA;
        }
        for (indiceElemento = 1; indiceElemento < tamanhoVetorC; indiceElemento += 2){
            int elementoVetorB = entrada.nextInt();
            vetorC[indiceElemento] = elementoVetorB;
        }
        printArray(vetorC, tamanhoVetorC);
    }
}
