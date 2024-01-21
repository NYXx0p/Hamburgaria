package com.school.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Optional;

import static com.school.sample.Settings.*;

public class InicioController {
    @FXML
    private TextField txt_Username;
    @FXML
    private PasswordField txt_password;
    @FXML
    private Button Login;
    @FXML
    private Button New_Conta;

    public void Login_Entered() {
        Login.setStyle("-fx-background-color: #939694; -fx-text-fill: #000;");
    }

    public void Login_Exited() {
        Login.setStyle("-fx-background-color: #313338;");
    }

    public void New_Conta_Entered() {
        New_Conta.setStyle("-fx-background-color: #d4d9d6; -fx-text-fill: #000;");
    }

    public void New_Conta_Exited() {
        New_Conta.setStyle("-fx-background-color: #fff;-fx-text-fill: #000;");
    }

    public void Login_On_Action() throws Exception {
        if (txt_Username.getText().isEmpty()
                || txt_password.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            String nome = txt_Username.getText();
            String pass = txt_password.getText();
            for(Login l : Settings.getListaContas()){
                if (l.getUsername() == nome || l.getPassword() == pass) {
                    Parent scene = FXMLLoader.load(getClass().getResource("Principal1.fxml"));
                    Stage voltar = new Stage();
                    voltar.initOwner(Settings.getPrimaryStage());
                    voltar.initModality(Modality.WINDOW_MODAL);
                    voltar.setScene(new Scene(scene));
                    Window window = Login.getScene().getWindow();
                    window.hide();
                    voltar.show();
                    break;
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Username e Password Incorretas");
                    alert.showAndWait();
                    break;
                }

            }
            }
        }
    }
