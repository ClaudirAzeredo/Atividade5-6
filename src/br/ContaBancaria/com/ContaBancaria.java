package br.ContaBancaria.com;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    // Construtor da classe
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Inicializa o saldo como zero ao criar a conta
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para consultar o saldo da conta
    public double consultarSaldo() {
        return saldo;
    }
}


