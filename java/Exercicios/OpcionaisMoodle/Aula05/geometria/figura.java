package Exercicios.OpcionaisMoodle.Aula05.geometria;

public abstract class figura {
    int x;
    int y;
    private double area;
    public abstract double area(double lado1, double lado2);
    public figura(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
}
