package Exercicios.cangurus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String resp = "";
        int x1 = leitor.nextInt();
        int v1 = leitor.nextInt();
        int x2 = leitor.nextInt();
        int v2 = leitor.nextInt();
        if(x1>x2 && v2>v1 || x2>x1 && v1>v2)
            resp = "SIM";
        if (x1==x2 && v1>v2||v2>v1)
            resp ="NAO";
        if(x1>x2 && v1>v2 || x2>x1 && v2>v1)
            resp = "NAO";

        System.out.println(resp);
    }
}
