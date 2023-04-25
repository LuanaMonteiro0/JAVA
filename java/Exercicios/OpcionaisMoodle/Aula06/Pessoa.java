package Exercicios.OpcionaisMoodle.Aula06;

import java.util.ArrayList;

public class Pessoa {
    private final String nome;
    private final String cpf;
    ArrayList<Cachorro> cachorros = new ArrayList<>();

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addCachorro(Cachorro cachorro){
        cachorros.add(cachorro);
    }

}
