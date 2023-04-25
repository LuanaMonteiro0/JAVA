package Exercicios.OpcionaisMoodle.Aula05.geometria;

public class Retangulo extends figura{
    private final double largura;
    private final double comprimento;


    public Retangulo(int x, int y, double largura, double comprimento) {
        super(x, y);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double area(double largura, double comprimento) {
        return largura * comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

}
