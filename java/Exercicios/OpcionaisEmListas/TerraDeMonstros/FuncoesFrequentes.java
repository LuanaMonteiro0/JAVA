package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.Scanner;

public class FuncoesFrequentes {
    Scanner scanner = new Scanner(System.in);
    public static void generateRandomVampires(){

    }

    public FuncoesFrequentes() {
    }
    public Monstro askForNewVampire(){
        System.out.println("Digite seu nome vampirico");
        String nome = scanner.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dn = scanner.nextLine();
        System.out.println("Digite seu nivel de vida (<100 >300)");
        double vida = scanner.nextDouble();
        Monstro You = new Monstro(nome,dn, vida);
        Clans.addToAllClans(You);
        return You;
    }

    public Monstro askForNewWolf(){
        System.out.println("Digite seu nome licantropo");
        String nome = scanner.nextLine();
        System.out.println("Digite sua data de nascimento");
        String dn = scanner.nextLine();
        System.out.println("Digite seu nivel de vida (<100 >300)");
        double vida = scanner.nextDouble();
        Monstro You = new Monstro(nome,dn, vida);
        Clans.addToAllClans(You);
        return You;
    }

    public void showMonsterStatuses(Monstro monstro){
        System.out.println("");
    }






}
