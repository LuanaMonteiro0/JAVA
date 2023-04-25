package Exercicios.OpcionaisMoodle.Aula05.geometria;

public class Triangulo extends figura{
    private final double a;
    private final double b;
    private final double c;

    public Triangulo(int x, int y, double a, double b, double c){
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcPerimetro(){
        return (a + b + c)/2;
    }

    @Override
    public double area(double perimetro, double lado2) {
        double areas = Math.sqrt(perimetro*(perimetro-a)*(perimetro-b)*(perimetro-c));
        return areas;
    }

}
