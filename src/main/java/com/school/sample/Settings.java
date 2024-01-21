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
    // Lista observável de produtos
    protected static ObservableList<produto> listaProduto = FXCollections.observableArrayList();
    // Método para obter a lista de produtos
    public static ObservableList<produto> getListaProduto() {
        return listaProduto;
    }
    // Lista observável de clientes
    protected static ObservableList<Cliente> listaCliente = FXCollections.observableArrayList();
    // Método para obter a lista de clientes
    public static ObservableList<Funcionario> getListaFuncionaro() {
        return listaFuncionario;
    }
    // Lista observável de funcionários
    protected static ObservableList<Funcionario> listaFuncionario = FXCollections.observableArrayList();
    // Método para obter a lista de funcionários
    public static ObservableList<Login> getListaContas() {
        return ListaContas;
    }
    // Lista observável de contas de login
    protected static ObservableList<Login> ListaContas = FXCollections.observableArrayList();
    // Método para obter a lista de clientes
    public static ObservableList<Cliente> getListaCliente() {
        return listaCliente;
    }
    // Variáveis estáticas para armazenar objetos editados
    private static produto ProdutoEdit;
    private static Cliente ClienteEdit;
    private static Funcionario funcionarioEdit;
    private static Login contaEdit;
    // Método para obter a conta de login editada
    public static Login getContaEdit() {
        return contaEdit;
    }
    // Método para definir a conta de login editada
    public static void setContaEdit(Login contaEdit) {
        Settings.contaEdit = contaEdit;}
    // Método para obter o cliente editado
    public static Cliente getClienteEdit() {
        return ClienteEdit;
    }
    // Método para definir o funcionário editado
    public static void setfuncionarioEdit(Funcionario funcionarioEdit) {
        Settings.funcionarioEdit = funcionarioEdit;}
    // Método para obter o funcionário editado
    public static Funcionario getFuncionarioEdit() {
        return funcionarioEdit;
    }
    // Método para definir o cliente editado
    public static void setClienteEdit(Cliente ClienteEdit) {
        Settings.ClienteEdit = ClienteEdit;
    }
    // Método para obter o produto editado
    public static produto getProdutoEdit() {
        return ProdutoEdit;
    }
    // Método para definir o produto editado
    public static void setProdutoEdit(produto ProdutoEdit) {
        Settings.ProdutoEdit = ProdutoEdit;
    }
    //Método para listar os produtos
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
    //Método para listar os Clientes
    public static void ListaCiente(){
        listaCliente.add(new Cliente(1,"Otacilio Alves","Rua dos Gays",915432789));
        listaCliente.add(new Cliente(2,"António Farbitnyk","Avenida do Putin",961234567));
        listaCliente.add(new Cliente(3,"Diogo Raminhos","Rua do Scamers",926789012));
        listaCliente.add(new Cliente(4,"Rafael Lordeiro","Praça dos Indianos",912345678));
        listaCliente.add(new Cliente(5,"Miguel Oliveira","Largo do Sol Poente",967890123));
        listaCliente.add(new Cliente(6,"Sofia Gonçalves","Rua das Amendoeiras",926543210));
        listaCliente.add(new Cliente(7,"Pedro Rodrigues","Avenida das Azáleas",961098765));
        listaCliente.add(new Cliente(8,"Catarina Almeida","Beco dos Pássaros",921234567));
        listaCliente.add(new Cliente(9,"André Sousa","Alameda das Violetas",966789012));
        listaCliente.add(new Cliente(10,"Florin Chascear","Rua do Desespero",924567890));
        listaCliente.add(new Cliente(11,"Margarida Costa","Rua do Alentejo",912345678));
        listaCliente.add(new Cliente(12,"Tiago Ferreira","Rua do Carmo",916789012));
        listaCliente.add(new Cliente(13,"Beatriz Pereira","Praia dos Coqueiros",921234567));
        listaCliente.add(new Cliente(14,"Rui Oliveira","Avenida D. João",967890123));
        listaCliente.add(new Cliente(15,"Mariana Silva","Largo da Sé",961098765));
        listaCliente.add(new Cliente(16,"Francisco Almeida","Travessa dos Castanheiross",926543210));
        listaCliente.add(new Cliente(17,"Cátia Martins","Praça do Comércio",921876543));
        listaCliente.add(new Cliente(18,"Diogo Rocha","Avenida da Liberdade",964321078));
        listaCliente.add(new Cliente(19,"Joana Sousa","Rua das Flores",929876543));
        listaCliente.add(new Cliente(20,"Leonor Carvalho","Avenida dos Pinheiros",962345678));
    }
    //Método para listar os Funcionarios
    public static void ListaFuncionario(){
        listaFuncionario.add(new Funcionario(100,"Florin Chascear","Rua do Desespero","Gerente da Hambúrgario"));
        listaFuncionario.add(new Funcionario(90,"António Farbitnyk","Avenida do Putin","Supervisor de Turno"));
        listaFuncionario.add(new Funcionario(80,"Andre Ventura","Rua dos Ciganos","Atendente do Balcão"));
        listaFuncionario.add(new Funcionario(70,"Ricardo Santos","Praça das Rosas","Atendente do drive-thru"));
        listaFuncionario.add(new Funcionario(60,"Alexandre Costa","Largo da Fonte","Cozinheiro"));
        listaFuncionario.add(new Funcionario(50,"Laura Almeida","Rua dos Cedros","Auxiliar do Cozinheiro"));
        listaFuncionario.add(new Funcionario(40,"Gabriel Lima","Avenida dos Lírios","Garçom"));
        listaFuncionario.add(new Funcionario(30,"João Sousa","Rua das Acácias","Montador de Hambúrguer"));
        listaFuncionario.add(new Funcionario(20,"Tiago Silva","Travessa do Bosque","Grelhador"));
        listaFuncionario.add(new Funcionario(10,"Otacilio Alves","Rua dos Gays","Limpeza"));
    }
    //Método para listar as Contas
    public static void ListaContas(){
        ListaContas.add(new Login("Thais Carla","gorda"));
        ListaContas.add(new Login("Florin","sumo"));
    }
}
