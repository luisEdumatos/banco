package model;

public class Pessoa {
    private String nome;
    private String telefone;
    private Conta conta;

    public Pessoa(String nome, String telefone, Conta conta) {
        this.nome = nome;
        this.telefone = telefone;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
