package Exercicios.OpcionaisEmListas.TerraDeMonstros;

public class Humanos {
    private final String Nome;
    private final String dataNasc;
    private double nivelVida;
    private boolean eTreinado;
    private String classeTreino;
    private Ordem ordemPertence;
    private Missao missao;

    public Humanos(String Nome, String dataNasc, boolean eTreinado){
        this.dataNasc = dataNasc;
        this.Nome = Nome;
        this.eTreinado = eTreinado;

    }
    public Humanos(String Nome, String dataNasc, String classeTreino){
        this.dataNasc = dataNasc;
        this.Nome = Nome;
        this.eTreinado = true;
        this.classeTreino = classeTreino;
    }
    public Humanos(String Nome, String dataNasc){
        this.dataNasc = dataNasc;
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public boolean isTreinado() {
        return eTreinado;
    }

    public double getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(double nivelVida) {
        this.nivelVida = nivelVida;
    }

    public void morto(Humanos humano){
        this.ordemPertence.setMorto(humano);
    }

}
