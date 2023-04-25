package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.ArrayList;

public class Clans {
    private static ArrayList<Monstro> todosOsMonstros = new ArrayList<>();
    private ArrayList<Monstro> Membros = new ArrayList<>();
    private ArrayList<Monstro> Mortos = new ArrayList<>();

    public static void addToAllClans(Monstro monstro){
        todosOsMonstros.add(monstro);
    }
    public Clans(Monstro monstro){
        Membros.add(monstro);
    }
    public Clans(){
    }

    public void setMorto(Monstro monstro){
        for (Monstro membro : Membros) {
            if (monstro == membro){
                Membros.remove(monstro);
                Mortos.add(monstro);
            }
        }
    }
}
