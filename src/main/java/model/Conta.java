package model;

public class Conta {
    private int numero;
    private String proprietario;
    protected double saldo;

    public Conta(int numero, String proprietario, double saldo) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valor) {
        //faz saque
    }

    public void deposito(double valor) {
        //faz deposito
    }
}
