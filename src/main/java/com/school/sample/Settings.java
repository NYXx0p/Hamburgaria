package com.school.sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Settings {
    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        Settings.primaryStage = primaryStage;
    }
    private static ObservableList<produto> listaProduto = FXCollections.observableArrayList();
    public static ObservableList<produto> getListaProduto() {
        return listaProduto;
    }
    public static void setListaAlunos(ObservableList<produto> listaProduto) {
        Settings.listaProduto = (ObservableList<produto>) listaProduto;
    }
    public static void ListaProduto(){
        listaProduto.add(new produto(1,"Hambúrger Simples","Hambúrguer","Normal",42,14.90));
        listaProduto.add(new produto(2,"Cheeseburguer","Hambúrguer","Normal",18,14.00));
        listaProduto.add(new produto(3,"KidsBurger","Hambúrguer","Pequeno",63,10.60));
        listaProduto.add(new produto(4,"XTudo","Hambúrguer","Mega Grande",25,17.90));
        listaProduto.add(new produto(5,"TexasBurger","Hambúrguer","Grande",47,15.90));
        listaProduto.add(new produto(6,"Planeta","Hambúrguer","Thais Carla",36,20.99));
        listaProduto.add(new produto(7,"Batata Frita(Palitos)","Acompanhamento","Normal",53,2.70));
        listaProduto.add(new produto(8,"Batata Frita(Rodelas)","Acompanhamento","Normal",59,2.70));
        listaProduto.add(new produto(9,"Batata Frita com queijo","Acompanhamento","Normal",33,4.50));
        listaProduto.add(new produto(10,"Ice Tea de Pêssego","Bebida","Normal",68,2.40));
        listaProduto.add(new produto(11,"Coca-Cola","Bebida","Normal",81,2.40));
        listaProduto.add(new produto(12,"Fanta de laranja","Bebida","Normal",27,2.70));
        listaProduto.add(new produto(13,"Mousse de Chocolate","Sobremesa","Pequeno",14,4.30));
        listaProduto.add(new produto(14,"Cheesecake","Sobremesa","Pequeno",20,1.59));
        listaProduto.add(new produto(15,"Arroz Doce","Sobremesa","Pequeno",17,4.30));
    }
}
