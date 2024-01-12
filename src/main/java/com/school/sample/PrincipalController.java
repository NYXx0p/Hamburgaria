package com.school.sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class PrincipalController {
    @FXML
    private Button btnFuncionario;
    @FXML
    private Button btnSair;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnReserva;
    @FXML
    private Button btnCliente;

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

    public void btnSairEntered(MouseEvent mouseEvent) {
        btnSair.setStyle("-fx-background-color: white; -fx-text-fill: #000;");
    }

    public void btnSairExited(MouseEvent mouseEvent) {
        btnSair.setStyle("-fx-background-color: transparent; -fx-border-color: #fff;");
    }
}