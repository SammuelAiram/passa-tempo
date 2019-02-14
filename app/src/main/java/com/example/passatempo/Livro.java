package com.example.passatempo;

public class Livro {
    private String nome;
    private String nomeAutor;
    private int qnt;

    public Livro(String nome, String nomeAutor, int qnt) {
        this.nome = nome;
        this.nomeAutor = nomeAutor;
        this.qnt = qnt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
}
