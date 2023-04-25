package Exercicios.ListaDois.HotelTailandia;

import java.util.Scanner;

public class Main {
    public static int inversora(int item){
        if(item == 0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int IA = leitor.nextInt();
        int IB = leitor.nextInt();
        int FA = leitor.nextInt();
        int FB = leitor.nextInt();

        int contadorDeOperacoes = 0;
        while(IA != FA || IB != FB){
            if(IB != FB){
                IB = inversora(IB);
                IA = inversora(IA);
                contadorDeOperacoes += 1;
            }
            if(IA != FA){
                IA = inversora(IA);
                contadorDeOperacoes += 1;
            }

        }
        System.out.println(contadorDeOperacoes);
    }

}
