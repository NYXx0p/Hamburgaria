package com.school.sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
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
    private AnchorPane Imagem;
    @FXML
    private ComboBox<?> Tamanho;

    @FXML
    private ComboBox<?> Tipo;

    @FXML
    private ImageView ImageView_Inventario;

    @FXML
    private BorderPane Principal;

    @FXML
    private TableColumn TableCell_ID;

    @FXML
    private TableColumn  TableCell_Nome;

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
    public void TipoLista() {
        ArrayList<String> ListaTipo = new ArrayList<>();
        ListaTipo.add("Hambúrguer");
        ListaTipo.add("Bebida");
        ListaTipo.add("Acompanhamento");
        ListaTipo.add("Sobremesa");
        ObservableList listaTipo = FXCollections.observableArrayList(ListaTipo);
        Tipo.setItems(listaTipo);
    }
    public void TamanhoLista(){
        ArrayList<String> ListaTamanho = new ArrayList<>();
        ListaTamanho.add("Pequeno");
        ListaTamanho.add("Normal");
        ListaTamanho.add("Grande");
        ListaTamanho.add("Mega Grande");
        ListaTamanho.add("Thais Carla");
        ObservableList listaTamanho = FXCollections.observableArrayList(ListaTamanho);
        Tamanho.setItems(listaTamanho);
    }
    public void Tabela(){
        TableViewInventario.setItems(Settings.getListaProduto());
        TableCell_ID.setCellValueFactory(new PropertyValueFactory<produto, Integer>("ID"));
        TableCell_Nome.setCellValueFactory(new PropertyValueFactory<produto, String>("Nome"));
        TableCell_Tipo.setCellValueFactory(new PropertyValueFactory<produto, String>("Tipo"));
        TableCell_Tamanho.setCellValueFactory(new PropertyValueFactory<produto, String>("Tamanho"));
        TableCell_Qtd.setCellValueFactory(new PropertyValueFactory<produto, Integer>("qtd"));
        TableCell_Preco.setCellValueFactory(new PropertyValueFactory<produto, Double>("preco"));
    }
    public void InventarioVerInfo(){
        produto prodData = (produto) TableViewInventario.getSelectionModel().getSelectedItem();
        id_Inventario_view.setText(String.valueOf(prodData.getID()));
        nome_inventario_view.setText(prodData.getNome());
        qtd_inventario_view.setText(String.valueOf(prodData.getQtd()));
        preco_inventario_view.setText(String.valueOf(prodData.getPreco()));
    }
    public void AdicionarAction(ActionEvent actionEvent) {
        if (id_Inventario_view.getText().isEmpty()
                ||nome_inventario_view.getText().isEmpty()
                || Tipo.getSelectionModel().getSelectedItem() == null
                || Tamanho.getSelectionModel().getSelectedItem() == null
                || qtd_inventario_view.getText().isEmpty()
                || preco_inventario_view.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        }

        int novoId = Integer.parseInt(id_Inventario_view.getText());

        // Verificar se o ID já existe na lista
        if (listaProduto.stream().anyMatch(p -> p.getID() == novoId)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Esse ID já foi inserido");
            alert.showAndWait();
        } else {
            String novoNome = nome_inventario_view.getText();
            String novoTipo = String.valueOf(Tipo.getSelectionModel().getSelectedItem());
            String novoTamanho = String.valueOf(Tamanho.getSelectionModel().getSelectedItem());
            int novoQtd = Integer.parseInt(qtd_inventario_view.getText());
            double novoPreco = Double.parseDouble(preco_inventario_view.getText());

            listaProduto.add(new produto(novoId, novoNome, novoTipo, novoTamanho, novoQtd, novoPreco));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText(null);
            alert.setContentText("O seu produto foi inserido");
            alert.showAndWait();
        }
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TipoLista();
        TamanhoLista();
        Tabela();;

    }
}
