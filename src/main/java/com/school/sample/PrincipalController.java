package com.school.sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class PrincipalController {
    @FXML
    private Button btnInventario;
    @FXML
    private Button btnImportar;
    @FXML
    private Button btnAdicionar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnFuncionario;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnReserva;
    @FXML
    private Button btnCliente;

    public void btnInventarioEntered(MouseEvent mouseEvent) {
        btnInventario.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }
    public void btnInventarioExited(MouseEvent mouseEvent) {
        btnInventario.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnMenuEntered(MouseEvent mouseEvent) {
        btnMenu.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnMenuExited(MouseEvent mouseEvent) {
        btnMenu.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }


    public void btnReservaEntered(MouseEvent mouseEvent) {
        btnReserva.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnReservaExited(MouseEvent mouseEvent) {
        btnReserva.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnClienteEntered(MouseEvent mouseEvent) {
        btnCliente.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnClienteExited(MouseEvent mouseEvent) {
        btnCliente.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnFuncionarioEntered(MouseEvent mouseEvent) {
        btnFuncionario.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnFuncionarioExited(MouseEvent mouseEvent) {
        btnFuncionario.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }

    public void btnVoltarEntered(MouseEvent mouseEvent) {
        btnVoltar.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnVoltarExited(MouseEvent mouseEvent) {
        btnVoltar.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }
    public void btnImportarEntered(MouseEvent mouseEvent) {
        btnImportar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnImportarExited(MouseEvent mouseEvent) {
        btnImportar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

    public void btnAdicionarEntered(MouseEvent mouseEvent) {
        btnAdicionar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnAdicionarExited(MouseEvent mouseEvent) {
        btnAdicionar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

    public void btnEditarEntered(MouseEvent mouseEvent) {
        btnEditar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnEditarExited(MouseEvent mouseEvent) {
        btnEditar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

    public void btnLimparEntered(MouseEvent mouseEvent) {
        btnLimpar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnLimparExited(MouseEvent mouseEvent) {
        btnLimpar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

    public void btnEliminarEntered(MouseEvent mouseEvent) {
        btnEliminar.setStyle("-fx-background-color: #c0c2c1; -fx-text-fill: #000; -fx-border-radius: 4px; -fx-border-color: #c0c2c1;");
    }

    public void btnEliminarExited(MouseEvent mouseEvent) {
        btnEliminar.setStyle("-fx-background-color: #313338; -fx-background-radius: 4px; -fx-text-fill: #fff;");
    }

}