package Exercicios.ProvasAnteriores.BancoComunista;

public class Cliente {
    private final String nome;
    private final String cpf;
    private Conta[] contas = new Conta[5];
    //um cliente pode ter no max 5 contas
    private int numContas = 0;

    public String getName(){
        return nome;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setConta(Conta conta){
        contas[numContas] = conta;
        numContas++;
    }

    public String getContasAsString(){
        StringBuilder listaContas = new StringBuilder();
        for (int i = 0; i < numContas; i++) {
            listaContas.append(contas[i].getEstadosAsString());
            listaContas.append("\n");
        }
        return listaContas.toString();
    }

}
