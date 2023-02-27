package Exercicios.Limonada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int C = leitor.nextInt();
        if(N> 0 && C>0) {
            int tot = 0;
            while (N > 0) {
                tot += C;
                if (C > 1)
                    C--;
                N--;
            }
            System.out.println(tot);
        }
    }
}
