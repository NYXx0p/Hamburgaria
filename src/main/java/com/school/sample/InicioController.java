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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

import static com.school.sample.Settings.*;

public class InicioController {
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_Criar;
    @FXML
    private TextField txt_new_Password;
    @FXML
    private TextField txt_new_Username;
    @FXML
    private AnchorPane Criar_Conta;
    @FXML
    private AnchorPane Log_in;
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
    public void btn_Criar_Entered() {
        btn_Criar.setStyle("-fx-background-color: #939694; -fx-text-fill: #000;");
    }

    public void btn_Criar_Exited() {
        btn_Criar.setStyle("-fx-background-color: #313338;");
    }
    public void btn_login_Entered() {
        btn_login.setStyle("-fx-background-color: #d4d9d6; -fx-text-fill: #000;");
    }
    public void btn_login_Exited() {
        btn_login.setStyle("-fx-background-color: #fff;-fx-text-fill: #000;");
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
            boolean check = false;
            for(Login l : Settings.ListaContas){
                if (l.getUsername().equals(nome) && l.getPassword().equals(pass)) {
                    Parent scene = FXMLLoader.load(getClass().getResource("Principal1.fxml"));
                    Stage voltar = new Stage();
                    voltar.initOwner(Settings.getPrimaryStage());
                    voltar.initModality(Modality.WINDOW_MODAL);
                    voltar.setScene(new Scene(scene));
                    Window window = Login.getScene().getWindow();
                    window.hide();
                    voltar.show();
                    check = true;
                    break;
                }
                }
            if(!check) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Username e Password Incorretas");
                alert.showAndWait();

            }
            }
        }

    public void New_Conta_On_Action() {
        Log_in.setVisible(false);
        Criar_Conta.setVisible(true);

    }
    public void btn_login_On_Action() {
        Log_in.setVisible(true);
        Criar_Conta.setVisible(false);

    }

    public void btn_Criar_On_Action() {
        if (txt_new_Username.getText().isEmpty()
                || txt_new_Password.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        }
        else {
            String novoUser = txt_new_Username.getText();
            if (ListaContas.stream().anyMatch(c -> Objects.equals(c.getUsername(), novoUser))) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse Username já foi inserido");
                alert.showAndWait();
            } else {
                String novoNome = txt_new_Username.getText();
                String novoPass = txt_new_Password.getText();
                // Pergunta se quer mesmo adicionar numa alert
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Criar");
                // Adiciona botões personalizados em português
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                Optional<ButtonType> choose = alert.showAndWait();
                if (choose.get() == botaoSim) {
                    //Se ele escolher sim ele adicionar a lista e avisa que foi inserido
                    ListaContas.add(new Login(novoNome,novoPass));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Information");
                    alert1.setHeaderText(null);
                    alert1.setContentText("A sua Conta foi Criada com Sucesso");
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

}
