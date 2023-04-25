package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.ArrayList;

public class Ordem {
    private static ArrayList<Humanos> todosOsHumanos = new ArrayList<>();
    private ArrayList<Humanos> Membros = new ArrayList<>();
    private ArrayList<Humanos> Mortos = new ArrayList<>();

    public void addToAllOrders(Humanos humano){
        todosOsHumanos.add(humano);
    }
    public void setMorto(Humanos humano){
        for (Humanos membro : Membros) {
            if (humano == membro){
                Membros.remove(humano);
                Mortos.add(humano);
            }
        }
    }

    private ArrayList<Humanos> canAddMembers(ArrayList<Humanos>humanos){
        ArrayList<Humanos> intermediaria = new ArrayList<>();
        for (Humanos humano : humanos) {
            if(humano.isTreinado()){
                intermediaria.add(humano);
            }
        }
        return intermediaria;
    }

    public void BecomeMember(Humanos humano){
        if(humano.isTreinado()){
            Membros.add(humano);
        }
    }
    public void BecomeMemberLote(ArrayList<Humanos> humanos){
        Membros.addAll(canAddMembers(humanos));
    }



}
