package model;

import Exceptions.SaqueException;

import javax.security.sasl.SaslException;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String proprietario, double saldo, double limite) {
        super(numero, proprietario, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void saque (double valor) {
        if (valor > (super.saldo + limite)) {
            throw new SaqueException("O valor de saque supera o saldo + limite");
        } else if (valor > super.saldo){
            super.saldo += limite;
            super.saldo -= valor;
            System.out.println("Seu saque foi efetuado, porém agora você está utilizando o limite");
        } else {
            super.saldo -= valor; 
        }
    }
}
