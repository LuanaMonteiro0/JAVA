package Exercicios.ProvasAnteriores.BancoComunista;

import java.util.Random;

public class Banco {
    private final int numero;
    private final int[] agencias = {1, 2, 3};
    //cada banco pode ter tres agencias a 1, a 2 e a 3;
    private Conta[] contas = new Conta[100];
    //cada banco pode ter 100 contas
    private int numContas;

    Random geradorRandomicos = new Random();

    public int sortearAgencia(){
        int indexAgencia = geradorRandomicos.nextInt(0,3);
        return agencias[indexAgencia];
    }

    public Banco(int numero){
        this.numero = numero;
    }

    public int getNumero () {
        return numero;
    }

    public int getnumContas(){
        return numContas;
    }

    public long[] getNumEachConta(){
        long[] numerosContas = new long[numContas];
        for (int i = 0; i < numContas; i++) {
            numerosContas[i] = contas[i].getNumero();
        }
        return numerosContas;
    }

    public String getContasAsString() {
        StringBuilder listaContas = new StringBuilder();
        for (int i = 0; i < numContas; i++) {
            listaContas.append("\n");
            listaContas.append(contas[i].getEstadosAsString());
            listaContas.append("\n");
        }
        return listaContas.toString();
    }

    public String getContasEmAgenciaAsString(int Agencia) {
        StringBuilder listaContas = new StringBuilder();
        for (int i = 0; i < numContas - 1; i++) {
            if(Agencia == contas[i].getAgencia()){
                listaContas.append("\n");
                listaContas.append(contas[i].getEstadosAsString());
                listaContas.append("\n");
            }
        }
        return listaContas.toString();
    }

    public double aprovarLimite(double quantidade, int tempoDeConta){
        double limDisponivel = 200.00 + (300.00 * tempoDeConta);
        return Math.min(limDisponivel, quantidade);
    }

    public void setConta(Conta conta){
        contas[numContas] = conta;
        numContas++;
    }

}
