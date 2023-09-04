package br.com.tripudp.model;

public abstract class ContaDeposito {
    protected int agencia;
    protected int numero;
    protected Funcionario titular;
    protected double saldo;

    public ContaDeposito() {
    }

    public ContaDeposito(int agencia, int numero, Funcionario titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Funcionario getTitular() {
        return titular;
    }

    public void setTitular(Funcionario titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
