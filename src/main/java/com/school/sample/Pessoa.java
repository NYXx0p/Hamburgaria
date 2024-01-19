package com.school.sample;

public class Pessoa {
    private int Id;
    private String nome;
    private String Endereco;
    public Pessoa(int Id, String nome, String endereco) {
        this.Id = Id;
        this.nome = nome;
        Endereco = endereco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }


}
