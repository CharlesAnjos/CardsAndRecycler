package br.edu.ifto.app.entidades;

public class Pessoa {

    private String nome;
    private int idade;
    private String resumo;

    public Pessoa(String nome, int idade, String resumo) {
        this.nome = nome;
        this.idade = idade;
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}