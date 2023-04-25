package Exercicios.Ead1.senhaProvisoria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String username = scanner.nextLine();
        if(username.length() > 1) {
            int stringMax = username.length() - 1;
            StringBuilder senhaProvisoria = new StringBuilder();
            for (int j = 0; j < stringMax; j++) {
                senhaProvisoria.append(username, 0, j + 1).append("*");
            }
            for (int i = stringMax; i >= 0; i--) {
                senhaProvisoria.append(username, 0, i).append("*");
            }
            String senha = senhaProvisoria.substring(0, (senhaProvisoria.length() - 2));
            System.out.println(senha);
        }
        else
            System.out.println("Invalido");
    }
}
