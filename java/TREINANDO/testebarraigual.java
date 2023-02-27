package TREINANDO;

public class testebarraigual {
    public static void main(String[] Args){
        //Operadores de atribuição
        int a = 5;
        int b = 1;
        int c = 3;
        int d = 4;
        int e = 8;
        double x;
        float y = 45.3f;
        a+=b;
        System.out.println(a);
        b-=c;
        System.out.println(b);
        c*=d;
        System.out.println(c);
        x = (double) d/e; //da certo
        d /= e; //queria que imprimisse 0.5 mas imprime 0
        //d = (double) d/e; //da errado, como atribuir na mesma variavel?
        //double d = (double) d/e; //da errado também  =(
        System.out.println(x);
        System.out.println(y);
    }
}
