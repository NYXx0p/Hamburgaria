package com.school.sample;

public class produto {

    private int ID;
    private String Nome;
    private String Tipo;
    private String Tamanho;
    private int qtd;
    private double preco;

    public produto(int ID, String Nome, String Tipo, String Tamanho, int qtd, double preco) {
        this.ID = ID;
        this.Nome = Nome;
        this.Tipo = Tipo;
        this.Tamanho = Tamanho;
        this.qtd = qtd;
        this.preco = preco;
    }
    public produto(int ID, String Nome, int qtd, double preco) {
        this.ID = ID;
        this.Nome = Nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
