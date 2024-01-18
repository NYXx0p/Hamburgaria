package com.school.sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import static com.school.sample.Settings.*;

public class PrincipalController implements Initializable {
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
    private BorderPane Principal;

    @FXML
    private TableColumn TableCell_ID;

    @FXML
    private TableColumn TableCell_Nome;

    @FXML
    private TableColumn TableCell_Preco;

    @FXML
    private TableColumn TableCell_Qtd;

    @FXML
    private TableColumn TableCell_Tamanho;

    @FXML
    private TableColumn TableCell_Tipo;

    @FXML
    private TableView TableViewInventario;

    @FXML
    private AnchorPane Tela_Inventario;

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
    private Button btnReserva;

    @FXML
    private Button btnSair;

    @FXML
    private TableView TableViewCliente;

    @FXML
    private TableColumn Table_Cell_Endereco_Cliente;

    @FXML
    private TableColumn Table_Cell_ID_Cliente;

    @FXML
    private TableColumn Table_Cell_N_Cliente;

    @FXML
    private TableColumn Table_Cell_Nome_Cliente;

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


    public void btnReservaEntered() {
        btnReserva.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnReservaExited() {
        btnReserva.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
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
    public void sair(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Sair");
        alert.setHeaderText("Deseja mesmo Sair?");
        // Adiciona botões personalizados em português
        ButtonType botaoSim = new ButtonType("Sim");
        ButtonType botaoNao = new ButtonType("Não");
        alert.getButtonTypes().setAll(botaoSim, botaoNao);
        Optional<ButtonType> choose = alert.showAndWait();
        if (choose.get() == botaoSim) {
            Platform.exit();
        }
    }

    public String TipoLista() {
        ArrayList<String> ListaTipo = new ArrayList<>();
        ListaTipo.add("Hambúrguer");
        ListaTipo.add("Bebida");
        ListaTipo.add("Acompanhamento");
        ListaTipo.add("Sobremesa");
        ObservableList<String> listaTipo = FXCollections.observableArrayList(ListaTipo);
        Tipo.setItems(listaTipo);
        return null;
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

    public void TabelaInventario() {
        TableViewInventario.setItems(Settings.getListaProduto());
        TableCell_ID.setCellValueFactory(new PropertyValueFactory<produto, Integer>("ID"));
        TableCell_Nome.setCellValueFactory(new PropertyValueFactory<produto, String>("Nome"));
        TableCell_Tipo.setCellValueFactory(new PropertyValueFactory<produto, String>("Tipo"));
        TableCell_Tamanho.setCellValueFactory(new PropertyValueFactory<produto, String>("Tamanho"));
        TableCell_Qtd.setCellValueFactory(new PropertyValueFactory<produto, Integer>("qtd"));
        TableCell_Preco.setCellValueFactory(new PropertyValueFactory<produto, Double>("preco"));
    }
    public void TabelaCliente(){
        TableViewCliente.setItems(Settings.getListaCliente());
        Table_Cell_ID_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("Id"));
        Table_Cell_Nome_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Nome"));
        Table_Cell_Endereco_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("Endereco"));
        Table_Cell_N_Cliente.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("N_Telefone"));
    }

    public void InventarioVerInfo() {
        produto prodData = (produto) TableViewInventario.getSelectionModel().getSelectedItem();
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

    //Esse é o metodo que criei e o nome eu adicionei no action do butão
    public void AdicionarAction(ActionEvent actionEvent) {
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
    public void AdicionarCienteAction(ActionEvent actionEvent) {
    }
    public void EditarAction(ActionEvent actionEvent) {
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
            produto ProdutoEdit = null;
            int novoId = Integer.parseInt(id_Inventario_view.getText());
            for (produto p : Settings.getListaProduto()) {
                if (p.getID() == novoId) {
                    ProdutoEdit = p;
                    break;
                }
            }
            if (ProdutoEdit != null) {
                ProdutoEdit.setNome(nome_inventario_view.getText());
                ProdutoEdit.setTipo(Tipo.getSelectionModel().getSelectedItem());
                ProdutoEdit.setTamanho(Tamanho.getSelectionModel().getSelectedItem());
                ProdutoEdit.setQtd(Integer.parseInt(qtd_inventario_view.getText()));
                ProdutoEdit.setPreco(Double.parseDouble(preco_inventario_view.getText()));
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
                    setProdutoEdit(ProdutoEdit);
                    TableViewInventario.refresh();
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
        }
    }
    public void EditarClienteAction(ActionEvent actionEvent) {
    }
    public void EliminarAction(ActionEvent actionEvent){
        if (id_Inventario_view.getText().isEmpty()
                || nome_inventario_view.getText().isEmpty()
                || Tipo.getSelectionModel().getSelectedItem() == null
                || Tamanho.getSelectionModel().getSelectedItem() == null
                || qtd_inventario_view.getText().isEmpty()
                || preco_inventario_view.getText().isEmpty()) {
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
            Optional<ButtonType> choose = alert.showAndWait();
            if (choose.get() == botaoSim) {
                int novoId = Integer.parseInt(id_Inventario_view.getText());
                for (produto p : listaProduto) {
                    if (p.getID() == novoId) {
                        Settings.getListaProduto().remove(p);
                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("Information");
                        alert1.setHeaderText(null);
                        alert1.setContentText("O seu produto foi Eliminado");
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
    public void EliminarClienteAction(ActionEvent actionEvent) {
    }

    @Override
        public void initialize (URL url, ResourceBundle resourceBundle){
            TipoLista();
            TamanhoLista();
            TabelaInventario();
            TabelaCliente();
        }



}
