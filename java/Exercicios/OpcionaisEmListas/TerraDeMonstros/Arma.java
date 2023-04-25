package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.Random;

public class Arma {
    private String Nome;
    private double dano;

    Random random = new Random();
    public Arma(String Nome){
        this.Nome = Nome;
        this.dano = random.nextDouble(150.00);
    }
    public void doDamage(Monstro monstro){
        double danoDado = monstro.getNivelVida() - this.dano;
        monstro.setNivelVida(danoDado);
    }
}
