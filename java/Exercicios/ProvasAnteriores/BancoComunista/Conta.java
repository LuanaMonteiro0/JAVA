package Exercicios.ProvasAnteriores.BancoComunista;

import java.util.Random;

public class Conta {
    private final long numero;
    private final long agencia;
    private double saldo;
    private double creditoDisponivel;
    private final int senha; //senha não pode ser alterada
    private int tempoDeConta; //cada operação add 1 aqui
    private final Cliente donoDaConta; //a conta não pode mudar de dono
    private final Banco bancoAdministrador; //a conta não pode mudar de banco

    Random geradorRandomicos = new Random();

    private long gerarNumConta(){
        long numNewConta = geradorRandomicos.nextLong();
        if(bancoAdministrador.getnumContas() > 0){
            long[] contas = bancoAdministrador.getNumEachConta();
            for (long numConta : contas) {
                if(numNewConta == numConta){
                    numNewConta = geradorRandomicos.nextLong();
                }
            }
            return numNewConta;
        }
        else
            return numNewConta;
    }

    public Conta(Cliente donoDaConta, Banco bancoAdministrador, int senha){
        this.donoDaConta = donoDaConta;
        this.bancoAdministrador = bancoAdministrador;
        this.numero = gerarNumConta();
        this.agencia = bancoAdministrador.sortearAgencia();
        this.saldo = 0.0;
        this.creditoDisponivel = 100.00;
        this.senha = senha;
        this.tempoDeConta = 1;
        donoDaConta.setConta(this);
        bancoAdministrador.setConta(this);
    }

    public long getNumero() {
        return numero;
    }

    public long getAgencia(){
        return agencia;
    }

    private boolean senhaEstaCorreta(int senha){
        return senha == this.senha;
    }

    public boolean saque(double valor, int senha){
        if(senhaEstaCorreta(senha) && (valor > 0) && (saldo + creditoDisponivel >= valor)){
            saldo -= valor;
            tempoDeConta++;
            return true;
        }
        else return false;
    }

    public boolean depositar(double valor, int senha){
        if(senhaEstaCorreta(senha) && valor > 0){
            saldo += valor;
            tempoDeConta++;
            return true;
        }
        else return false;
    }

    //isso não é um comentário ruidoso!
    //porque alterei double pra bool no retorno do metodo?
    //aumenta o limite aqui mesmo, chamando o metodo
    //aprovar limite do banco internamente!
    //retornando true se a operação foi feita e false se não;
    public boolean aumentarLimite(double valor,int senha){
        if(senhaEstaCorreta(senha) && valor > 100.00){
            creditoDisponivel = bancoAdministrador.aprovarLimite(valor, this.tempoDeConta);
            tempoDeConta++;
            return true;

        }else return false;
    }

    public double saldo(int senha){
        if(senhaEstaCorreta(senha)) {
            tempoDeConta++;
            return saldo;
        }else return -77777;//p conseguir mandar mensagem de erro para a pessoa;
    }

    public String getEstadosAsString(){
        return "Numero: " + this.numero + "\nAgencia: " + this.agencia + "\nSaldo: " + this.saldo +
                "\nLimite Disponivel: "+ this.creditoDisponivel + "\nTempo de conta: " + this.tempoDeConta +
                "\nCliente: " + this.donoDaConta.getName() + "\nBanco: " + this.bancoAdministrador.getNumero();

    }
}
