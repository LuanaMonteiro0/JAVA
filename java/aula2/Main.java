package aula2;

public class Main {
    public static void main(String[] args) {
        // Declaração com conjunto de valores
        String[] nomes = { "Jaime", "Felipe", "Renato" };
        // Alocação e posterior atribuição
        int[] idades = new int[3];
        idades[0] = 60;
        idades[1] = 30;
        idades[2] = 36;

        //println imprime valores individuais em formato padrão
        System.out.println("Laço for convencional: ");
        // Mais complexo de iterar, mas fácil de obter o índice
        for (int i = 0; i < nomes.length; i++)
        //printf permite a impressão, com formatação, de múltiplos valores
            System.out.printf("Nome [%d]: %s\t \t", i, nomes[i]);
        System.out.println("\n\nLaço for para iterar conjuntos:");
        // Fácil de iterar, mas difícil de obter o índice. Itera todo o conjunto.
        for(String s : nomes)
            System.out.printf("Nome: " + s + "\t \t");


    }
}
