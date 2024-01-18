package com.school.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class Settings {
    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        Settings.primaryStage = primaryStage;
    }
    protected static ObservableList<produto> listaProduto = FXCollections.observableArrayList();
    public static ObservableList<produto> getListaProduto() {
        return listaProduto;
    }
    protected static ObservableList<Cliente> listaCliente = FXCollections.observableArrayList();
    public static ObservableList<Cliente> getListaCliente() {
        return listaCliente;
    }
    private static produto ProdutoEdit;

    public static produto getProdutoEdit() {
        return ProdutoEdit;
    }

    public static void setProdutoEdit(produto ProdutoEdit) {
        ProdutoEdit = ProdutoEdit;
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
    public static void ListaCiente(){
        listaCliente.add(new Cliente(1,"João Silva","Rua da Primavera",915432789));
        listaCliente.add(new Cliente(2,"Maria Santos","Avenida dos Castanheiros",961234567));
        listaCliente.add(new Cliente(3,"Diogo Pereira","Travessa das Oliveiras",926789012));
        listaCliente.add(new Cliente(4,"Inês Costa","Praça da Liberdade",912345678));
        listaCliente.add(new Cliente(5,"Miguel Oliveira","Largo do Sol Poente",967890123));
        listaCliente.add(new Cliente(6,"Sofia Gonçalves","Rua das Amendoeiras",926543210));
        listaCliente.add(new Cliente(7,"Pedro Rodrigues","Avenida das Azáleas",961098765));
        listaCliente.add(new Cliente(8,"Catarina Almeida","Beco dos Pássaros",921234567));
        listaCliente.add(new Cliente(9,"André Sousa","Alameda das Violetas",966789012));
        listaCliente.add(new Cliente(10,"Florin Chascear","Praia dos Coqueiros",924567890));

    }
}
