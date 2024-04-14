package br.ContaBancaria.com;

public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma instância de ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria("123456");

        // Depositando dinheiro na conta e verificando o saldo
        minhaConta.depositar(1000);
        System.out.println("Saldo após depósito: " + minhaConta.consultarSaldo());

        // Sacando dinheiro da conta e verificando o saldo
        minhaConta.sacar(500);
        System.out.println("Saldo após saque: " + minhaConta.consultarSaldo());

        // Tentando sacar mais dinheiro do que o saldo disponível
        minhaConta.sacar(600);

        // Verificando o saldo final
        System.out.println("Saldo final: " + minhaConta.consultarSaldo());
    }
}



