package Exercicios.OpcionaisMoodle.Aula05.geometria;

public class Main {
    public static void main(String[] args) {
        figura[][] figuras = new figura[3][50]; //array de 3 linhas e 50 colunas
        Circulo[]circulos = new Circulo[50];
        Retangulo[] retangulos = new Retangulo[50];
        Triangulo[] triangulos = new Triangulo[50];

        //faz 50 circulos
        for (int i = 0; i < circulos.length; i++) {
            Circulo cir = new Circulo(i, 1, 1);
            cir.setArea(cir.area(cir.getRaio(), Math.PI));
            circulos[i] = cir;

        }
        //faz 50 retangulos
        for (int i = 0; i < retangulos.length; i++) {
            Retangulo ret = new Retangulo(1, 1, i, i+1);
            ret.setArea(ret.area(ret.getLargura(), ret.getComprimento()));
            retangulos[i] = ret;
        }
        //faz 50 triangulos
        for (int i = 1; i < 51; i++) {
            Triangulo tri = new Triangulo(1, 1, i, i+1, i+2);
            double perimetro = tri.calcPerimetro();
            tri.setArea(tri.area(perimetro,1));
            triangulos[i-1] = tri;
        }

        //preenche lista de 150 itens
        figuras[0] = circulos;
        figuras[1] = retangulos;
        figuras[2] = triangulos;

        double sumAreas = 0.0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 50; j++) {
                sumAreas = sumAreas + figuras[i][j].getArea();
            }

        }

        System.out.println("A soma das areas é " + sumAreas);
    }
}
