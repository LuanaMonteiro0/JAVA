package Exercicios.OBI;

import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int resp, P1, P2;
        int N1 = leitor.nextInt();
        int N2 = leitor.nextInt();
        int N3 = leitor.nextInt();
        P1 = Math.max(Math.max(N1, N2), N3);
        P2 = Math.min(Math.min(N1, N2), N3);
        if(N1 != P1 && N1 != P2)
            resp = N1;
        else if(N2 != P1 && N2 != P2)
            resp = N2;
        else
            resp = N3;
        System.out.println(resp);
    }
}
