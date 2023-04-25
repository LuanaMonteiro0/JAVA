package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.Random;

public class Missao {
    private char tipo;
    private int qntsAlvos;
    private Arma arma;
    private String descricao;
    Random random = new Random();
    public Missao(char tipo, Arma arma){
        this.tipo = tipo;
        this.arma = arma;
        this.qntsAlvos = random.nextInt(4);
    }
    public Missao(char tipo, Arma arma, String descricao){
        this.tipo = tipo;
        this.arma = arma;
        this.qntsAlvos = random.nextInt(4);
        this.descricao = descricao;
    }

}
