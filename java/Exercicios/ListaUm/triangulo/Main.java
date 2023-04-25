package Exercicios.triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String resposta;
        Scanner leitor = new Scanner(System.in);
        String linha = leitor.nextLine();
        String[] lados = linha.split(" ");
        if(lados.length == 3) {
            int ld1, ld2, ld3;
            ld1 = Integer.parseInt(lados[0]);
            ld2 = Integer.parseInt(lados[1]);
            ld3 = Integer.parseInt(lados[2]);
            if (ld1 > 0 && ld2 > 0 && ld3 > 0) {
                if (ld1 == ld2 && ld1 == ld3)
                    resposta = "Equilatero";
                else if ((ld1 == ld2 || ld2 == ld3 || ld1 == ld3) && (ld1+ld2 > ld3 && ld2+ld3 > ld1 && ld3+ld1 > ld2))
                    resposta = "Isosceles";
                else if (ld1+ld2 > ld3 && ld2+ld3 > ld1 && ld3+ld1 > ld2)
                    resposta = "Escaleno";

                else
                    resposta = "Nao forma triangulo";
            }
            else
                resposta = "erro";
        }
        else
            resposta = "erro";

        System.out.println(resposta);
    }
}
