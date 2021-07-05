package model;

public class ContaPoupanca extends Conta{

    private double rendimento;

    public ContaPoupanca (int numero, String proprietario, double saldo, double rendimento) {
        super(numero, proprietario, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void aplicaRendimento() {
        super.saldo += super.saldo * rendimento;
    }

    @Override
    public void saque(double valor) {
        //Realiza saque com tratamento de exceção
    }
}
