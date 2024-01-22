package com.school.sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import static com.school.sample.Settings.*;


public class PrincipalController implements Initializable {
    @FXML
    private TextField Pesquisar_Funcionario;
    @FXML
    private TextField Pesquisa_Cliente;
    @FXML
    private TextField Pesquisa_Produto;
    @FXML
    private Hyperlink HyperLink_Escola;
    @FXML
    private Hyperlink HyperLink;
    @FXML
    private AnchorPane Tela_AcercaDe;
    @FXML
    private AnchorPane Tela_Funcionario;
    @FXML
    private TableColumn <Funcionario, String> TableCell_Posicao_Funcionario;
    @FXML
    private TableColumn <Funcionario, String> TableCell_Endereco_Funcionario;
    @FXML
    private TableColumn <Funcionario, String> TableCell_Nome_Funcionario;
    @FXML
    private TableColumn <Funcionario, Integer> TableCell_Id_Funcionario;
    @FXML
    private TableView <Funcionario> TableView_Funcionar;
    @FXML
    private ComboBox<String> Posicao_Funcionario;
    @FXML
    private AnchorPane Tela_Cliente;

    @FXML
    private AnchorPane Tela_Inventario;

    @FXML
    private TextField preco_inventario_view;
    @FXML
    private TextField qtd_inventario_view;
    @FXML
    private TextField nome_inventario_view;
    @FXML
    private TextField id_Inventario_view;
    @FXML
    private ComboBox<String> Tamanho;

    @FXML
    private ComboBox<String> Tipo;

    @FXML
    private TableColumn <produto, Integer> TableCell_ID;

    @FXML
    private TableColumn <produto, String> TableCell_Nome;

    @FXML
    private TableColumn <produto, Double> TableCell_Preco;
    @FXML
    private TableColumn <produto, Integer> TableCell_Qtd;

    @FXML
    private TableColumn <produto, String>  TableCell_Tamanho;

    @FXML
    private TableColumn <produto, String>  TableCell_Tipo;

    @FXML
    private TableView <produto> TableViewInventario;

    @FXML
    private Button btnAdicionar;

    @FXML
    private Button btnCliente;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnFuncionario;

    @FXML
    private Button btnInventario;

    @FXML
    private Button btnAcercaDe;

    @FXML
    private Button btnSair;

    @FXML
    private TableView <Cliente> TableViewCliente;

    @FXML
    private TableColumn <Cliente,String> Table_Cell_Endereco_Cliente;

    @FXML
    private TableColumn <Cliente, Integer> Table_Cell_ID_Cliente;

    @FXML
    private TableColumn <Cliente,Integer> Table_Cell_N_Cliente;

    @FXML
    private TableColumn <Cliente,String> Table_Cell_Nome_Cliente;

    @FXML
    private Button btnAdicionarCliente;

    @FXML
    private Button btnEditarCliente;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TextField txt_Edereco_Cliente;

    @FXML
    private TextField txt_Id_Cliente;

    @FXML
    private TextField txt_N_Cliente;

    @FXML
    private TextField txt_nome_Cliente;
    @FXML
    private Button btnEliminar_Funcionario;
    @FXML
    private Button btn_Editar_Funcionario;
    @FXML
    private Button btn_Adicionar_Funcionario;
    @FXML
    private TextField txt_Endereco_Funcionario;
    @FXML
    private TextField txt_Id_Funcionario;
    @FXML
    private TextField txt_Nome_Funcionario;

//Essa parte é para a "animação dos butões"
    public void btnInventarioEntered() {
        btnInventario.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnInventarioExited() {
        btnInventario.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnAcercaDeEntered() {
        btnAcercaDe.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnAcercaDeExited() {
        btnAcercaDe.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnClienteEntered() {
        btnCliente.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnClienteExited() {
        btnCliente.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnFuncionarioEntered() {
        btnFuncionario.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnFuncionarioExited() {
        btnFuncionario.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnSairEntered() {
        btnSair.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnSairExited() {
        btnSair.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnAdicionarEntered() {
        btnAdicionar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnAdicionarExited() {
        btnAdicionar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

    public void btnEditarEntered() {
        btnEditar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnEditarExited() {
        btnEditar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

    public void btnEliminarEntered() {
        btnEliminar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnEliminarExited() {
        btnEliminar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btnAdicionarClienteEntered(){
        btnAdicionarCliente.setStyle("-fx-background-color: #999999; -fx-background-radius: 4px; -fx-text-fill: #000;");
    }
    public void btnAdicionarClienteExited(){
        btnAdicionarCliente.setStyle("-fx-background-color: #333333; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btnEditarClienteEntered() {
        btnEditarCliente.setStyle("-fx-background-color: #999999; -fx-background-radius: 4px; -fx-text-fill: #000;");
    }
    public void btnEditarClienteExited() {
        btnEditarCliente.setStyle("-fx-background-color: #333333; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btnEliminarClienteEntered() {
        btnEliminarCliente.setStyle("-fx-background-color: #999999; -fx-background-radius: 4px; -fx-text-fill: #000;");
    }
    public void btnEliminarClienteExited() {
        btnEliminarCliente.setStyle("-fx-background-color: #333333; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }
    public void btn_Adicionar_Funcionario_Entered(){
        btn_Adicionar_Funcionario.setStyle("-fx-background-color: #9794ac; -fx-background-radius: 5px; -fx-text-fill: #000;");
    }
    public void btn_Adicionar_Funcionario_Exited(){
        btn_Adicionar_Funcionario.setStyle("-fx-background-color: #919de6; -fx-background-radius: 5px; -fx-text-fill: #fff;");

    }
    public void btn_Editar_Funcionario_Entered(){
        btn_Editar_Funcionario.setStyle("-fx-background-color: #9794ac; -fx-background-radius: 5px; -fx-text-fill: #000;");

    }
    public void btn_Editar_Funcionario_Exited(){
        btn_Editar_Funcionario.setStyle("-fx-background-color: #919de6; -fx-background-radius: 5px; -fx-text-fill: #fff;");

    }
    public void btnEliminar_Funcionario_Entered(){
        btnEliminar_Funcionario.setStyle("-fx-background-color: #9794ac; -fx-background-radius: 5px; -fx-text-fill: #000;");

    }
    public void btnEliminar_Funcionario_Exited(){
        btnEliminar_Funcionario.setStyle("-fx-background-color: #919de6; -fx-background-radius: 5px; -fx-text-fill: #fff;");
    }
    // Método responsável por realizar a pesquisa de produtos com o Id e o nome
    public void Pesquisa_Produto_Key() {
        FilteredList<produto> filter = new FilteredList<>(listaProduto, e -> true);
        // Adiciona um ouvinte para o campo de pesquisa de produto
        Pesquisa_Produto.textProperty().addListener((Observable, oldValue, newValue) ->{
            // Define o predicado de filtragem com base no valor do campo de pesquisa
            filter.setPredicate(predicateproduto ->{
                // Verifica se o campo de pesquisa está vazio e retorna todos os produtos se verdadeiro
                if(newValue == null && newValue.isEmpty()){
                    return true;
                }
                //Converte tudo para minúsculas
                String ProcurarP = newValue.toLowerCase();
                if (String.valueOf(predicateproduto.getID()).equals(ProcurarP)){
                    return true;
                }else if (predicateproduto.getNome().toLowerCase().contains(ProcurarP)) {
                    return true;
                }
                // Retorna falso se nada for encontrado
                return false;
            });
        });
        // Cria uma lista ordenada com base na lista filtrada
        SortedList<produto> sortList =  new SortedList<>(filter);
        // Liga o comparador da lista ordenada ao comparador da tabela de inventário
        sortList.comparatorProperty().bind(TableViewInventario.comparatorProperty());
        // Define os itens da tabela de inventário como a lista ordenada
        TableViewInventario.setItems(sortList);
    }
    public void Pesquisa_Cliente_Key() {
        FilteredList<Cliente> filter = new FilteredList<>(listaCliente, e -> true);

        Pesquisa_Cliente.textProperty().addListener((Observable, oldValue, newValue) ->{

            filter.setPredicate(predicatecliente ->{
                if(newValue == null && newValue.isEmpty()){
                    return true;
                }
                String ProcurarC = newValue.toLowerCase();
                if (String.valueOf(predicatecliente.getId()).equals(ProcurarC)){
                    return true;
                }else if (predicatecliente.getNome().toLowerCase().contains(ProcurarC)) {
                    return true;
                }else if(predicatecliente.getEndereco().toLowerCase().contains(ProcurarC)){
                    return true;
                }else if(String.valueOf(predicatecliente.getN_Telefone()).startsWith(ProcurarC)) {
                    return true;
                }
                return false;
            });
        });
        SortedList<Cliente> sortList =  new SortedList<>(filter);
        sortList.comparatorProperty().bind(TableViewCliente.comparatorProperty());
        TableViewCliente.setItems(sortList);
    }
    public void Pesquisar_Funcionario_Key() {
        FilteredList<Funcionario> filter = new FilteredList<>(listaFuncionario, e -> true);

        Pesquisar_Funcionario.textProperty().addListener((Observable, oldValue, newValue) ->{

            filter.setPredicate(predicatefuncionario ->{
                if(newValue == null && newValue.isEmpty()){
                    return true;
                }
                String ProcurarF = newValue.toLowerCase();
                if (String.valueOf(predicatefuncionario.getId()).equals(ProcurarF)){
                    return true;
                }else if (predicatefuncionario.getNome().toLowerCase().contains(ProcurarF)) {
                    return true;
                }else if(predicatefuncionario.getEndereco().toLowerCase().contains(ProcurarF)){
                    return true;
                }else if(predicatefuncionario.getPosicao().contains(ProcurarF)) {
                    return true;
                }
                return false;
            });
        });
        SortedList<Funcionario> sortList =  new SortedList<>(filter);
        sortList.comparatorProperty().bind(TableView_Funcionar.comparatorProperty());
        TableView_Funcionar.setItems(sortList);

    }
    // Método responsável por lidar com o evento de sair da aplicação
    public void sair() throws Exception {
        // Cria um alerta de confirmação
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log out");
        alert.setHeaderText("Deseja mesmo dar Log out?");
        // Adiciona botões personalizados em português
        ButtonType botaoSim = new ButtonType("Sim");
        ButtonType botaoNao = new ButtonType("Não");
        alert.getButtonTypes().setAll(botaoSim, botaoNao);
        // Exibe o alerta e aguarda a escolha do utilizador
        Optional<ButtonType> choose = alert.showAndWait();
        // Verifica se o utilizador escolheu "Sim"
        if (choose.get() == botaoSim) {
            // Carrega a cena de início a partir do ficheiro FXML
            Parent scene = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
            // Cria uma nova janela para a cena de início
            Stage voltar = new Stage();
            // Define a janela principal como proprietária da nova janela
            voltar.initOwner(Settings.getPrimaryStage());
            voltar.setResizable(false);
            voltar.initModality(Modality.WINDOW_MODAL);
            voltar.setScene(new Scene(scene));
            // Obtém a janela atual e a oculta
            Window window = btnSair.getScene().getWindow();
            window.hide();
            // Exibe a nova janela de início
            voltar.show();
        }
    }
    // Método chamado quando o botão de cliente é acionado
    public void btnCliente_On_Action() {
        // Torna a tela de cliente visível
        Tela_Cliente.setVisible(true);
        Tela_Inventario.setVisible(false);
        Tela_Funcionario.setVisible(false);
        Tela_AcercaDe.setVisible(false);
    }
    public void btnInvertario_On_Action() {
        Tela_Cliente.setVisible(false);
        Tela_Inventario.setVisible(true);
        Tela_Funcionario.setVisible(false);
        Tela_AcercaDe.setVisible(false);
    }
    public void Funcionario_On_Action() {
        Tela_Cliente.setVisible(false);
        Tela_Inventario.setVisible(false);
        Tela_Funcionario.setVisible(true);
        Tela_AcercaDe.setVisible(false);
    }
    public void AcercaDe_On_Action(){
        Tela_Cliente.setVisible(false);
        Tela_Inventario.setVisible(false);
        Tela_Funcionario.setVisible(false);
        Tela_AcercaDe.setVisible(true);
    }
    // Método associado à ação do Hyperlink (link) que redireciona para uma página web
    @FXML
    private void Hyperlink_On_Action(ActionEvent actionEvent) throws IOException {
        // URL para a página do GitHub do projeto
        String url = "https://github.com/NYXx0p/Hamburgaria";
        // Abre a URL no navegador padrão do sistema usando as classes Desktop e URI do Java
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
    }
    @FXML
    public void HyperLink_Escola_On_Action(ActionEvent actionEvent) throws IOException {
        String url = "https://sites.google.com/aeaquaalba.pt/ae-aqua-alba-agualva-sintra/";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));

    }
    // Método para configurar o tipo de lista (por exemplo, para um ComboBox)
    public void TipoLista() {
        // Cria um ArrayList para armazenar os diferentes tipos
        ArrayList<String> ListaTipo = new ArrayList<>();
        ListaTipo.add("Hambúrguer");
        ListaTipo.add("Bebida");
        ListaTipo.add("Acompanhamento");
        ListaTipo.add("Sobremesa");
        // Converte a lista em uma ObservableList para ser usada em componentes gráficos do JavaFX
        ObservableList<String> listaTipo = FXCollections.observableArrayList(ListaTipo);
        // Configura os itens do componente gráfico na ComboBox comi uma lista
        Tipo.setItems(listaTipo);
    }

    public void TamanhoLista() {
        ArrayList<String> ListaTamanho = new ArrayList<>();
        ListaTamanho.add("Pequeno");
        ListaTamanho.add("Normal");
        ListaTamanho.add("Grande");
        ListaTamanho.add("Mega Grande");
        ListaTamanho.add("Thais Carla");
        ObservableList<String> listaTamanho = FXCollections.observableArrayList(ListaTamanho);
        Tamanho.setItems(listaTamanho);
    }
    public void PosicaoLista(){
        ArrayList<String> ListaPosicao = new ArrayList<>();
        ListaPosicao.add("Gerente da Hambúrgario");
        ListaPosicao.add("Supervisor de Turno");
        ListaPosicao.add("Atendente do Balcão");
        ListaPosicao.add("Atendente do drive-thru");
        ListaPosicao.add("Cozinheiro");
        ListaPosicao.add("Auxiliar do Cozinheiro");
        ListaPosicao.add("Garçom");
        ListaPosicao.add("Montador de Hambúrguer");
        ListaPosicao.add("Grelhador");
        ListaPosicao.add("Limpeza");
        ObservableList<String> listaPosicao = FXCollections.observableArrayList(ListaPosicao);
        Posicao_Funcionario.setItems(listaPosicao);
    }
    // Método para configurar a tabela de funcionários
    public void TabelaFuncionar(){
        // Define os itens da TableView com a lista de funcionários armazenada nas configurações
        TableView_Funcionar.setItems(Settings.getListaFuncionaro());
        // Configura as colunas da TableView para exibir as propriedades dos funcionários
        TableCell_Id_Funcionario.setCellValueFactory(new PropertyValueFactory<>("Id"));
        TableCell_Nome_Funcionario.setCellValueFactory(new PropertyValueFactory<>("nome"));
        TableCell_Endereco_Funcionario.setCellValueFactory(new PropertyValueFactory<>("Endereco"));
        TableCell_Posicao_Funcionario.setCellValueFactory(new PropertyValueFactory<>("Posicao"));
    }
    public void TabelaInventario() {
        TableViewInventario.setItems(Settings.getListaProduto());
        TableCell_ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        TableCell_Nome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        TableCell_Tipo.setCellValueFactory(new PropertyValueFactory<>("Tipo"));
        TableCell_Tamanho.setCellValueFactory(new PropertyValueFactory<>("Tamanho"));
        TableCell_Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        TableCell_Preco.setCellValueFactory(new PropertyValueFactory<>("preco"));
    }
    public void TabelaCliente(){
        TableViewCliente.setItems(Settings.getListaCliente());
        Table_Cell_ID_Cliente.setCellValueFactory(new PropertyValueFactory<>("Id"));
        Table_Cell_Nome_Cliente.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        Table_Cell_Endereco_Cliente.setCellValueFactory(new PropertyValueFactory<>("Endereco"));
        Table_Cell_N_Cliente.setCellValueFactory(new PropertyValueFactory<>("N_Telefone"));
    }
    // Método para visualizar informações detalhadas de um produto no inventário
    public void InventarioVerInfo() {
        // Obtém o produto selecionado na TableView de inventário
        produto prodData = (produto) TableViewInventario.getSelectionModel().getSelectedItem();
        // Define os textos dos elementos visuais com base nas informações do produto
        id_Inventario_view.setText(String.valueOf(prodData.getID()));
        nome_inventario_view.setText(prodData.getNome());
        qtd_inventario_view.setText(String.valueOf(prodData.getQtd()));
        preco_inventario_view.setText(String.valueOf(prodData.getPreco()));
        Tipo.setValue(prodData.getTipo());
        Tamanho.setValue(prodData.getTamanho());
    }
    public void ClienteVerInfo(){
        Cliente clienteData = (Cliente) TableViewCliente.getSelectionModel().getSelectedItem();
        txt_Id_Cliente.setText(String.valueOf(clienteData.getId()));
        txt_nome_Cliente.setText(clienteData.getNome());
        txt_Edereco_Cliente.setText(clienteData.getEndereco());
        txt_N_Cliente.setText(String.valueOf(clienteData.getN_Telefone()));
    }
    public void FuncionarVerInfo(){
        Funcionario funcionarioData = (Funcionario) TableView_Funcionar.getSelectionModel().getSelectedItem();
        txt_Id_Funcionario.setText(String.valueOf(funcionarioData.getId()));
        txt_Nome_Funcionario.setText(funcionarioData.getNome());
        txt_Endereco_Funcionario.setText(funcionarioData.getEndereco());
        Posicao_Funcionario.setValue(funcionarioData.getPosicao());
    }

    //Esse é o metodo que criei e o nome eu adicionei no action do butão
    public void AdicionarAction() {
        // Isso é para ver se algum TextFild está vazio e se estiver avisa com um alerta
        if (id_Inventario_view.getText().isEmpty()
                || nome_inventario_view.getText().isEmpty()
                || Tipo.getSelectionModel().getSelectedItem() == null
                || Tamanho.getSelectionModel().getSelectedItem() == null
                || qtd_inventario_view.getText().isEmpty()
                || preco_inventario_view.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // pega o Id da textFild do id
            int novoId = Integer.parseInt(id_Inventario_view.getText());
            // Verificar se o ID já existe na lista
            if (listaProduto.stream().anyMatch(p -> p.getID() == novoId)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID já foi inserido");
                alert.showAndWait();
            } else {
                //Se não tiver ele pega o que está escrito e selecionado de cada caixa e mete num variavel
                String novoNome = nome_inventario_view.getText();
                String novoTipo = String.valueOf(Tipo.getSelectionModel().getSelectedItem());
                String novoTamanho = String.valueOf(Tamanho.getSelectionModel().getSelectedItem());
                int novoQtd = Integer.parseInt(qtd_inventario_view.getText());
                double novoPreco = Double.parseDouble(preco_inventario_view.getText());
                // Pergunta se quer mesmo adicionar numa alert
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Adicionar");
                //Mostra o que ele vai adicionar no alet
                alert.setHeaderText("Deseja mesmo Adicionar?"+"\n"+"ID: " + novoId + "\n" + "Nome: " + novoNome + "\n" + "Tipo: " + novoTipo + "\n" + "Tamanho: " + novoTamanho + "\n" + "Quantidade: " + novoQtd + "\n" + "Preço: " + novoPreco);
                // Adiciona botões personalizados em português
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    //Se ele escolher sim ele adicionar a lista e avisa que foi inserido
                    listaProduto.add(new produto(novoId, novoNome, novoTipo, novoTamanho, novoQtd, novoPreco));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Information");
                    alert1.setHeaderText(null);
                    alert1.setContentText("O seu produto foi inserido");
                    alert1.showAndWait();
                } else {
                    //Se for cancelado ele avisa tmb
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Information");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
        }

    }
    public void AdicionarCienteAction() {
        if (txt_Id_Cliente.getText().isEmpty()
                || txt_nome_Cliente.getText().isEmpty()
                || txt_Edereco_Cliente.getText().isEmpty()
                || txt_N_Cliente.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // pega o Id da textFild do id
            int novoId = Integer.parseInt(txt_Id_Cliente.getText());
            // Verificar se o ID já existe na lista
            if (listaCliente.stream().anyMatch(p -> p.getId() == novoId)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID já foi inserido");
                alert.showAndWait();
            } else {
                //Se não tiver ele pega o que está escrito e selecionado de cada caixa e mete num variavel
                String novoNome = txt_nome_Cliente.getText();
                String novoEndereco = txt_Edereco_Cliente.getText();
                int novoNum = Integer.parseInt(txt_N_Cliente.getText());
                // Pergunta se quer mesmo adicionar numa alert
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Adicionar");
                //Mostra o que ele vai adicionar no alet
                alert.setHeaderText("Deseja mesmo Adicionar?"+"\n"+"ID: " + novoId + "\n" + "Nome: " + novoNome + "\n" + "Endereço: " + novoEndereco + "\n" + "Número de Telefone: " + novoNum );
                // Adiciona botões personalizados em português
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    //Se ele escolher sim ele adicionar a lista e avisa que foi inserido
                    listaCliente.add(new Cliente(novoId, novoNome, novoEndereco, novoNum));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Information");
                    alert1.setHeaderText(null);
                    alert1.setContentText("O Cliente foi inserido");
                    alert1.showAndWait();
                } else {
                    //Se for cancelado ele avisa tmb
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Information");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
        }
    }
    public void Adicionar_Funcionario_On_Action(){
        if (txt_Id_Funcionario.getText().isEmpty()
            || txt_Nome_Funcionario.getText().isEmpty()
            || txt_Endereco_Funcionario.getText().isEmpty()
            || Posicao_Funcionario.getSelectionModel().getSelectedItem() == null){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Por favor, preencha todos os campos");
        alert.showAndWait();
    } else {
        // pega o Id da textFild do id
        int novoId = Integer.parseInt(txt_Id_Funcionario.getText());
        // Verificar se o ID já existe na lista
        if (listaFuncionario.stream().anyMatch(f -> f.getId() == novoId)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Esse ID já foi inserido");
            alert.showAndWait();
        } else {
            //Se não tiver ele pega o que está escrito e selecionado de cada caixa e mete num variavel
            String novoNome = txt_Nome_Funcionario.getText();
            String novoEndereco = txt_Endereco_Funcionario.getText();
            String novoPosicao = String.valueOf(Posicao_Funcionario.getSelectionModel().getSelectedItem());
            // Pergunta se quer mesmo adicionar numa alert
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Adicionar");
            //Mostra o que ele vai adicionar no alet
            alert.setHeaderText("Deseja mesmo Adicionar?"+"\n"+"ID: " + novoId + "\n" + "Nome: " + novoNome + "\n" + "Endereço: " + novoEndereco + "\n" + "Posição: " + novoPosicao );
            // Adiciona botões personalizados em português
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                //Se ele escolher sim ele adicionar a lista e avisa que foi inserido
                listaFuncionario.add(new Funcionario(novoId, novoNome, novoEndereco, novoPosicao));
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText(null);
                alert1.setContentText("O Funcionario foi inserido");
                alert1.showAndWait();
            } else {
                //Se for cancelado ele avisa tmb
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Information");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();
            }
        }
    }
    }
    // Método para lidar com a ação de editar um produto no inventário
    public void EditarAction() {
        // Verifica se algum dos campos necessários está vazio
        if (id_Inventario_view.getText().isEmpty()
                || nome_inventario_view.getText().isEmpty()
                || Tipo.getSelectionModel().getSelectedItem() == null
                || Tamanho.getSelectionModel().getSelectedItem() == null
                || qtd_inventario_view.getText().isEmpty()
                || preco_inventario_view.getText().isEmpty()) {
            // Mostra uma mensagem de erro se algum campo estiver vazio
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // Inicializa uma variável para o produto a ser editado
            produto ProdutoEdit = null;
            // Obtém o novo ID a partir do campo de texto
            int novoId = Integer.parseInt(id_Inventario_view.getText());
            // Procura o produto na lista com base no novo ID
            for (produto p : Settings.getListaProduto()) {
                if (p.getID() == novoId) {
                    ProdutoEdit = p;
                    break;
                }
            }
            // Verifica se o produto foi encontrado
            if (ProdutoEdit != null) {
                // Atualiza as informações do produto com os novos valores
                ProdutoEdit.setNome(nome_inventario_view.getText());
                ProdutoEdit.setTipo(Tipo.getSelectionModel().getSelectedItem());
                ProdutoEdit.setTamanho(Tamanho.getSelectionModel().getSelectedItem());
                ProdutoEdit.setQtd(Integer.parseInt(qtd_inventario_view.getText()));
                ProdutoEdit.setPreco(Double.parseDouble(preco_inventario_view.getText()));
                // Pergunta ao utilizador se deseja realmente editar
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Editar");
                alert.setHeaderText("Deseja mesmo Editar?");
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                // Cria um segundo alerta para mostrar informações após a edição
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText(null);
                // Obtém a escolha do utilizador
                Optional<ButtonType> choose = alert.showAndWait();
                // Se o utilizador escolher "Sim"
                if (choose.get() == botaoSim) {
                    // Atualiza o produto editado nas configurações
                    setProdutoEdit(ProdutoEdit);
                    // Atualiza a TableView para refletir as mudanças
                    TableViewInventario.refresh();
                    // Mostra uma mensagem de sucesso
                    alert1.setContentText("Edição bem-sucedida");
                    alert1.showAndWait();
                } else {
                    // Se o utilizador escolher "Não", mostra uma mensagem de cancelamento
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Information");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
            else{
                // Se o produto não for encontrado, mostra uma mensagem de erro
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID não foi encontrado");
                alert.showAndWait();}
        }
    }
    public void EditarClienteAction() {
        if (txt_Id_Cliente.getText().isEmpty()
                || txt_nome_Cliente.getText().isEmpty()
                || txt_Edereco_Cliente.getText().isEmpty()
                || txt_N_Cliente.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Cliente ClienteEdit = null;
            int novoId = Integer.parseInt(txt_Id_Cliente.getText());
            for (Cliente c : Settings.getListaCliente()) {
                if (c.getId() == novoId) {
                    ClienteEdit = c;
                    break;
                }
            }
            if (ClienteEdit != null) {
                ClienteEdit.setNome(txt_nome_Cliente.getText());
                ClienteEdit.setEndereco(txt_Edereco_Cliente.getText());
                ClienteEdit.setN_Telefone(Integer.parseInt(txt_N_Cliente.getText()));
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Editar");
                alert.setHeaderText("Deseja mesmo Editar?");
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText(null);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    setClienteEdit(ClienteEdit);
                    TableViewCliente.refresh();
                    alert1.setContentText("Edição bem-sucedida");
                    alert1.showAndWait();
                } else {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Information");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID não foi encontrado");
                alert.showAndWait();}
        }
    }
    public void Editar_Funcionario_On_Action(){
        if (txt_Id_Funcionario.getText().isEmpty()
                || txt_Nome_Funcionario.getText().isEmpty()
                || txt_Endereco_Funcionario.getText().isEmpty()
                || Posicao_Funcionario.getSelectionModel().getSelectedItem() == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Funcionario funcionarioEdit = null;
            int novoId = Integer.parseInt(txt_Id_Funcionario.getText());
            for (Funcionario f : Settings.getListaFuncionaro()) {
                if (f.getId() == novoId) {
                    funcionarioEdit = f;
                    break;
                }
            }
            if (funcionarioEdit != null) {
                funcionarioEdit.setNome(txt_Nome_Funcionario.getText());
                funcionarioEdit.setEndereco(txt_Endereco_Funcionario.getText());
                funcionarioEdit.setPosicao(String.valueOf(Posicao_Funcionario.getSelectionModel().getSelectedItem()));
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Editar");
                alert.setHeaderText("Deseja mesmo Editar?");
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText(null);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    setfuncionarioEdit(funcionarioEdit);
                    TableView_Funcionar.refresh();
                    alert1.setContentText("Edição bem-sucedida");
                    alert1.showAndWait();
                } else {
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Information");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Cancelado com Sucesso");
                    alert2.showAndWait();
                }
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse ID não foi encontrado");
                alert.showAndWait();}
        }
    }
    // Método para lidar com a ação de eliminar um produto do inventário
    public void EliminarAction(){
        // Verifica se algum dos campos necessários está vazio
        if (id_Inventario_view.getText().isEmpty()
                || nome_inventario_view.getText().isEmpty()
                || Tipo.getSelectionModel().getSelectedItem() == null
                || Tamanho.getSelectionModel().getSelectedItem() == null
                || qtd_inventario_view.getText().isEmpty()
                || preco_inventario_view.getText().isEmpty()) {
            // Mostra uma mensagem de erro se algum campo estiver vazio
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor selecione algum Produto da tabela");
            alert.showAndWait();}
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Deseja mesmo Eliminar?"+"\n"+"ID: " +id_Inventario_view.getText() + "\n" + "Nome: " + nome_inventario_view.getText() + "\n" + "Tipo: " + Tipo.getSelectionModel().getSelectedItem() + "\n" + "Tamanho: " + Tamanho.getSelectionModel().getSelectedItem() + "\n" + "Quantidade: " + qtd_inventario_view.getText() + "\n" + "Preço: " + preco_inventario_view.getText());
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            // Mostra o alerta e aguarda a escolha do utilizador
            Optional<ButtonType> choose = alert.showAndWait();
            // Se o utilizador escolher "Sim"
            if (choose.get() == botaoSim) {
                // Obtém o novo ID a partir do campo de texto
                int novoId = Integer.parseInt(id_Inventario_view.getText());
                // Procura o produto na lista com base no novo ID
                for (produto p : listaProduto) {
                    if (p.getID() == novoId) {
                        // Remove o produto da lista de produtos nas configurações
                        Settings.getListaProduto().remove(p);
                        id_Inventario_view.setText("");
                        nome_inventario_view.setText("");
                        Tipo.setValue(null);
                        Tamanho.setValue(null);
                        qtd_inventario_view.setText("");
                        preco_inventario_view.setText("");
                        // Mostra uma mensagem de informação indicando que o produto foi eliminado
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Information");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O seu produto foi Eliminado");
                        alert1.showAndWait();
                        // Sai do loop pois o produto foi encontrado e eliminado
                        break;
                    }
                }
            }
            else{
                // Se o utilizador escolher "Não", mostra uma mensagem de cancelamento
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Information");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();

            }
        }
    }
    public void EliminarClienteAction() {
        if (txt_Id_Cliente.getText().isEmpty()
                || txt_nome_Cliente.getText().isEmpty()
                || txt_Edereco_Cliente.getText().isEmpty()
                || txt_N_Cliente.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Deseja mesmo Eliminar?"+"\n"+"ID: " +txt_Id_Cliente.getText() + "\n" + "Nome: " + txt_nome_Cliente.getText() + "\n" + "Endereço: " + txt_Edereco_Cliente.getText() + "\n" + "Número de Telefo: " + txt_N_Cliente.getText());
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                int novoId = Integer.parseInt(txt_Id_Cliente.getText());
                for (Cliente c : listaCliente) {
                    if (c.getId() == novoId) {
                        Settings.getListaCliente().remove(c);
                        txt_Id_Cliente.setText("");
                        txt_nome_Cliente.setText("");
                        txt_Edereco_Cliente.setText("");
                        txt_N_Cliente.setText("");
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Information");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O Cliente foi Eliminado");
                        alert1.showAndWait();
                        break;
                    }
                }
            }
            else{
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Information");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();

            }
        }
    }
    public void Eliminar_Funcionario_On_Action(){
        if (txt_Id_Funcionario.getText().isEmpty()
                || txt_Nome_Funcionario.getText().isEmpty()
                || txt_Endereco_Funcionario.getText().isEmpty()
                || Posicao_Funcionario.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor selecione algum Funcionario da tabela");
            alert.showAndWait();}
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Deseja mesmo Eliminar?"+"\n"+"ID: " +txt_Id_Funcionario.getText() + "\n" + "Nome: " + txt_Nome_Funcionario.getText() + "\n" + "Endereço: " + txt_Endereco_Funcionario.getText() + "\n" + "Posição: " + Posicao_Funcionario.getSelectionModel().getSelectedItem());
            ButtonType botaoSim = new ButtonType("Sim");
            ButtonType botaoNao = new ButtonType("Não");
            alert.getButtonTypes().setAll(botaoSim, botaoNao);
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                int novoId = Integer.parseInt(txt_Id_Funcionario.getText());
                for (Funcionario f : listaFuncionario) {
                    if (f.getId() == novoId) {
                        Settings.getListaFuncionaro().remove(f);
                        txt_Id_Funcionario.setText("");
                        txt_Nome_Funcionario.setText("");
                        Posicao_Funcionario.setValue(null);
                        txt_N_Cliente.setText("");
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Information");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O Funcionario foi Eliminado");
                        alert1.showAndWait();
                        break;
                    }
                }
            }
            else{
                Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                alert2.setTitle("Information");
                alert2.setHeaderText(null);
                alert2.setContentText("Cancelado com Sucesso");
                alert2.showAndWait();

            }
        }
    }
    @Override
        public void initialize (URL url, ResourceBundle resourceBundle){
            TipoLista();
            TamanhoLista();
            PosicaoLista();
            TabelaInventario();
            TabelaCliente();
            TabelaFuncionar();
        }
}
