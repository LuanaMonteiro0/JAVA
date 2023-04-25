package Exercicios.ListaDois.lookAtThisPhotograph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double largura = leitor.nextDouble();
        double altura = leitor.nextDouble();
        double F1Largura = leitor.nextDouble();
        double F1Altura = leitor.nextDouble();
        double F2Largura = leitor.nextDouble();
        double F2Altura = leitor.nextDouble();
        boolean cond1 = (F1Altura + F2Altura <= altura) && (F1Largura <= largura) && (F2Largura <= largura);
        boolean cond2 = (F1Largura + F2Largura <= largura) && (F1Altura <= altura) && (F2Altura <= altura);
        if(cond1 ||cond2)
            System.out.println("S");
        else
            System.out.println("N");

    }
}
