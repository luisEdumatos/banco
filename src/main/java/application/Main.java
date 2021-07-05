package application;

import exceptions.SaqueException;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;

        try {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite o telefone da pessoa: ");
            String telefone = sc.nextLine();
            System.out.print("Digite o tipo de conta: Corrente ou Poupanca");
            String tipo = sc.next();
            if (tipo.equals("Corrente")) {
                System.out.print("Digite o numero da conta: ");
                int numero = sc.nextInt();
                System.out.print("Digite o saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Digite o limite da conta");
                double limite = sc.nextDouble();
                pessoa = new Pessoa(nome, telefone, new ContaCorrente(numero, nome, saldo, limite));
            } else if (tipo.equals("Poupanca")) {
                System.out.print("Digite o numero da conta: ");
                int numero = sc.nextInt();
                System.out.print("Digite o saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Digite o rendimento");
                double rendimento = sc.nextDouble();
                pessoa = new Pessoa(nome, telefone, new ContaPoupanca(numero, nome, saldo, rendimento));
            }

            System.out.print("Digite quanto você quer sacar da conta: ");
            double qtsSacar = sc.nextDouble();
            //Testando tratamento de excecao para saque
            pessoa.getConta().saque(qtsSacar);

        } catch (SaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
