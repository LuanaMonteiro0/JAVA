package Exercicios.ListaDois.ConstroiVetorDez;

import java.util.Scanner;

public class Main {
    public static void removeElement(int[] array, int indiceItem){
        for (int i = indiceItem; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
    }
    public static int checkRepeat(int[] array, int item){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int[] array, int qntItens){
        for (int i = 0; i < qntItens; i++) {
            if (i != 0){
            System.out.print(" " + array[i]);
            }else{
                System.out.print(array[i]);
            }
        }
    }
    public static int checkcheck(int[] array, int qnItens){
        for (int i = 0; i < qnItens; i++) {
            for (int j = 0; j < qnItens; j++) {
                if((array[i] == array[j]) && (i != j))
                    return 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        int[] array = new int[ARRAY_SIZE];
        int num;
        Scanner leitor = new Scanner(System.in);
        int qntdItens = 5;
        array[0] = leitor.nextInt();
        array[1] = leitor.nextInt();
        array[2] = leitor.nextInt();
        array[3] = leitor.nextInt();
        array[4] = leitor.nextInt();
            if(checkcheck(array,qntdItens) == 0) {
                while (ARRAY_SIZE != qntdItens && qntdItens != 0) {
                    printArray(array, qntdItens);
                    System.out.print("\n");
                    num = leitor.nextInt();
                    if (checkRepeat(array, num) != -1) {
                        int posArray = checkRepeat(array, num);
                        removeElement(array, posArray);
                        qntdItens--;
                    } else {
                        array[qntdItens] = num;
                        qntdItens++;
                    }
                }
                printArray(array, qntdItens);
            }else{
                System.out.println("Erro");
            }
    }
}
