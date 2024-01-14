package com.school.sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class PrincipalController implements Initializable {
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
    private Button btnImportar;

    @FXML
    private Button btnInventario;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnMenu;

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

    public void btnMenuEntered() {
        btnMenu.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnMenuExited() {
        btnMenu.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
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

    public void btnImportarEntered() {
        btnImportar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnImportarExited() {
        btnImportar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
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

    public void btnLimparEntered() {
        btnLimpar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnLimparExited() {
        btnLimpar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
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
        ListaTipo.add("Bebeida");
        ListaTipo.add("Acompanhamento");
        ListaTipo.add("Sobremesa");
        ObservableList listaData = FXCollections.observableArrayList(ListaTipo);
        Tipo.setItems(listaData);
    }
    public void TamanhoLista(){
        ArrayList<String> ListaTamanho = new ArrayList<>();
        ListaTamanho.add("Pequeno");
        ListaTamanho.add("Normal");
        ListaTamanho.add("Grande");
        ListaTamanho.add("Mega Grande");
        ListaTamanho.add("Thais Carla");
        ObservableList listaData = FXCollections.observableArrayList(ListaTamanho);
        Tamanho.setItems(listaData);
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TipoLista();
        TamanhoLista();
        Tabela();

    }
}
