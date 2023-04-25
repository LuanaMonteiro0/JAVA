package Exercicios.OpcionaisMoodle.Aula06;

public class Cachorro {
    private final String nome;
    private final String raca;
    private Boolean vax;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        vax = false;
    }

    public void vacinarCao(){
        vax = true;
    }
}
