package Exercicios.ListaUm.cangurus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String resp = "";
        long x1 = leitor.nextInt();
        long v1 = leitor.nextInt();
        long x2 = leitor.nextInt();
        long v2 = leitor.nextInt();
        boolean condicaoTrue = x1 > x2 && v2 > v1 || x2 > x1 && v1 > v2 || x1 == x2 && v1 == v2;
        if (v1 > 0 && v2 > 0){
            if (condicaoTrue)
                resp = "SIM";
            else
                resp = "NAO";
        }else if(v1 < 0 && v2 < 0){
            if (condicaoTrue)
                resp = "SIM";
            else
                resp = "NAO";
        }

        System.out.println(resp);
    }
}
