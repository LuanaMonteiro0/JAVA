package Exercicios.OpcionaisMoodle.Aula05.geometria;

public class Circulo extends figura{
    private final double raio;
    private static final double pi = Math.PI;

    public Circulo(double raio, int x, int y) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public double area(double raio, double pi) {
        return pi * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }



}
