package Exercicios.OpcionaisEmListas.TerraDeMonstros;

import java.util.Random;

public class Monstro {
    private String Nome;
    private String dataNasc;
    private Monstro transformou;
    private String classe;
    private double nivelFome;
    private double nivelVida;
    private double nivelDamage;
    private Clans clan;

    Random random = new Random();
    public Monstro(String name, String dataNasc, Monstro transformou, double nivelVida){
        Nome = name;
        this.dataNasc = dataNasc;
        this.transformou = transformou;
        this.nivelVida = nivelVida;
        this.nivelDamage = random.nextDouble(100.00);
    }
    public Monstro(String name, String dataNasc, double nivelVida){
        Nome = name;
        this.dataNasc = dataNasc;
        this.nivelVida = nivelVida;
        this.nivelDamage = random.nextDouble(100.00);
    }
    public void setClan(Clans clan) {
        this.clan = clan;
    }

    public void transforma(Humanos humano, Monstro monstro){
        new Monstro(humano.getNome(), humano.getDataNasc(), monstro, humano.getNivelVida());

    }

    public void alimentacao(Humanos humano, Monstro monstro){
        if (humano.isTreinado())
            humano.morto(humano);
    }

    public void doDamage(Humanos humano){
        double danoDado = humano.getNivelVida() - this.nivelDamage;
        humano.setNivelVida(danoDado);
    }

    public double getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(double nivelVida) {
        this.nivelVida = nivelVida;
    }

    public String getNome() {
        return Nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public Monstro getTransformou() {
        return transformou;
    }

    public String getClasse() {
        return classe;
    }

    public double getNivelFome() {
        return nivelFome;
    }

    public double getNivelDamage() {
        return nivelDamage;
    }

    public Clans getClan() {
        return clan;
    }


}
