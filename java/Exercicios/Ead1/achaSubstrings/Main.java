package Exercicios.Ead1.achaSubstrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int K = scanner.nextInt();
        String substring1 = string.substring(0, K);
        String substring2 = string.substring((string.length() - K));
        if(substring1.compareToIgnoreCase(substring2) >= 1){
            System.out.println(substring2+" "+substring1);
        }else{
            System.out.println(substring1+" "+substring2);
        }
    }
}
