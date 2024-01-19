package com.school.sample;

public class Funcionario extends Pessoa{
    private String Posicao;

    public Funcionario(int Id,String nome,String Edereco,String Posicao){
        super(Id,nome,Edereco);
        this.Posicao = Posicao;
    }
    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String Posicao) {
        this.Posicao = Posicao;
    }
}
