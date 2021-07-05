package application;

import exceptions.SaqueException;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite o telefone da pessoa: ");
            String telefone = sc.nextLine();
            System.out.print("Digite o tipo de conta: Corrente ou Poupanca");
            String tipo = sc.next();
            if (tipo == "Corrente") {
                System.out.print("Digite o numero da conta: ");
                int numero = sc.nextInt();
                System.out.print("Digite o saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Digite o limite da conta");
                double limite = sc.nextDouble();
                Pessoa pessoa = new Pessoa(nome, telefone, new ContaCorrente(numero, nome, saldo, limite));
            } else if (tipo == "Poupanca") {
                System.out.print("Digite o numero da conta: ");
                int numero = sc.nextInt();
                System.out.print("Digite o saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Digite o rendimento");
                double rendimento = sc.nextDouble();
                Pessoa pessoa = new Pessoa(nome, telefone, new ContaPoupanca(numero, nome, saldo, rendimento));
            }
        } catch (SaqueException e) {

        } finally {
            sc.close();
        }
    }
}
