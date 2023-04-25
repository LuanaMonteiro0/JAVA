package Exercicios.ProvasAnteriores.BancoComunista;

public class Main {
    public static void main(String[] args) {
        Banco bancoComunista = new Banco(666);
        Cliente luanaMonteiro = new Cliente("Luana Monteiro", "258.369.147-99");
        Conta primeiraContaDaLuana = new Conta(luanaMonteiro,bancoComunista,123456);

        System.out.println("Contas no Banco comunista: ");
        System.out.println(bancoComunista.getContasAsString());

        System.out.println("Contas da Luana: ");
        System.out.println(luanaMonteiro.getContasAsString());

        System.out.println("Saldo da conta da Luana: " + primeiraContaDaLuana.saldo(123456));

        primeiraContaDaLuana.saque(50, 123456);
        System.out.println("Saldo da conta da Luana apos saque: " + primeiraContaDaLuana.saldo(123456));

        primeiraContaDaLuana.depositar(400, 123456);
        System.out.println("Saldo da conta da Luana apos deposito do pet: " + primeiraContaDaLuana.saldo(123456));

        primeiraContaDaLuana.aumentarLimite(1000, 123456);
        System.out.println("\nConta da luana após aumentar limite: \n" + primeiraContaDaLuana.getEstadosAsString());

        Banco BancoCapitalista = new Banco(555);
        Cliente luanMarqueti = new Cliente("Luan Marqueti", "121.545.787-99");
        Conta primeiraContaLuan = new Conta(luanMarqueti, bancoComunista, 1234);
        Conta segundaContaLuan = new Conta(luanMarqueti, BancoCapitalista,5678);

        Cliente lucasLazarini = new Cliente("Lucas Lazarini", "545.888.779-99");
        Conta primeiraContaLucas = new Conta(lucasLazarini, bancoComunista,999);
        Conta segundaContaLucas = new Conta(lucasLazarini, bancoComunista, 888);
        Conta terceiraContaLucas = new Conta(lucasLazarini,BancoCapitalista,777);

        System.out.println("\nContas no Banco comunista: ");
        System.out.println(bancoComunista.getContasAsString());

        System.out.println("\nContas no Banco capitalista: ");
        System.out.println(BancoCapitalista.getContasAsString());

        System.out.println("\nContas Ag1 Banco Comunista: ");
        System.out.println(bancoComunista.getContasEmAgenciaAsString(1));

        System.out.println("\nContas Ag2 Banco Comunista: ");
        System.out.println(bancoComunista.getContasEmAgenciaAsString(2));

        System.out.println("\nContas Ag3 Banco Comunista: ");
        System.out.println(bancoComunista.getContasEmAgenciaAsString(3));

        System.out.println("\nContas Ag1 Banco Capitalista: ");
        System.out.println(BancoCapitalista.getContasEmAgenciaAsString(1));

        System.out.println("\nContas Ag2 Banco Capitalista: ");
        System.out.println(BancoCapitalista.getContasEmAgenciaAsString(2));

        System.out.println("\nContas Ag3 Banco Capitalista: ");
        System.out.println(BancoCapitalista.getContasEmAgenciaAsString(3));



    }
}
