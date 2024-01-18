package com.school.sample;

public class Cliente extends Pessoa{
    private int N_Telefone;

    public Cliente (int Id,String nome,String Edereco, int N_Telefone){
        super(Id,nome,Edereco);
        this.N_Telefone = N_Telefone;
    }
    public int getN_Telefone() {
        return N_Telefone;
    }

    public void setN_Telefone(int n_Telefone) {
        N_Telefone = n_Telefone;
    }

}
