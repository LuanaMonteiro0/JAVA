package Exercicios.ListaDois.ConstroiVetorDez;
import java.util.Scanner;
public class Luan {
    public static void main(String[] args) {

        int quantidadePosicoesVetores = 5;
        int indiceVetor;
        int[] vetorA = new int[quantidadePosicoesVetores];
        int[] vetorB = new int[quantidadePosicoesVetores];
        int[] vetorC = new int[quantidadePosicoesVetores];
        Scanner leitor = new Scanner(System.in);

        for (indiceVetor = 0; indiceVetor < quantidadePosicoesVetores; indiceVetor++){
            int elementoVetorA = leitor.nextInt();
            vetorA[indiceVetor] = elementoVetorA;
            int elementoVetorB = leitor.nextInt();
            vetorB[indiceVetor] = elementoVetorB;
            vetorC[indiceVetor] = elementoVetorA + elementoVetorB;
        }
        for (int indiceElementoVetorC = 0; indiceElementoVetorC < quantidadePosicoesVetores; indiceElementoVetorC++){
            if (indiceElementoVetorC < quantidadePosicoesVetores - 1){
                System.out.print(vetorC[indiceElementoVetorC] + ", ");
            }
            else{
                System.out.print(vetorC[indiceElementoVetorC]);
            }
        }
    }
}
