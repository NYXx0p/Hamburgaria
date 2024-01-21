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
    //Essa parte é para a "animação dos butões"
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
    // Método para lidar com a ação de login
    public void Login_On_Action() throws Exception {
        // Verifica se os campos de nome de utilizador e palavra-passe estão vazios
        if (txt_Username.getText().isEmpty()
                || txt_password.getText().isEmpty()) {
            // Mostra uma mensagem de erro se algum campo estiver vazio
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        } else {
            // Obtém o nome de utilizador e a palavra-passe fornecidos
            String nome = txt_Username.getText();
            String pass = txt_password.getText();
            // Variável de controlo para verificar se as credenciais são válidas
            boolean check = false;
            // Percorre a lista de contas de login para verificar as credenciais
            for(Login l : Settings.ListaContas){
                if (l.getUsername().equals(nome) && l.getPassword().equals(pass)) {
                    // Se as credenciais forem válidas, carrega a cena "Principal1.fxml"
                    Parent scene = FXMLLoader.load(getClass().getResource("Principal1.fxml"));
                    Stage voltar = new Stage();
                    voltar.initOwner(Settings.getPrimaryStage());
                    voltar.initModality(Modality.WINDOW_MODAL);
                    voltar.setScene(new Scene(scene));
                    // Obtém a janela atual e a oculta
                    Window window = Login.getScene().getWindow();
                    window.hide();
                    // Exibe a nova janela "Principal1.fxml"
                    voltar.show();
                    // Atualiza a variável de controlo
                    check = true;
                    break;
                }
                }
            // Se não encontrar avisa que o usename e password estão incorretas
            if(!check) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Username e Password Incorretas");
                alert.showAndWait();

            }
            }
        }
    // Método para lidar com a ação de criar uma nova conta
    public void New_Conta_On_Action() {
        // Torna o painel de login invisível
        Log_in.setVisible(false);
        // Torna o painel de criar conta visível
        Criar_Conta.setVisible(true);

    }
    public void btn_login_On_Action() {
        Log_in.setVisible(true);
        Criar_Conta.setVisible(false);

    }
    // Método para lidar com a ação de criar uma nova conta
    public void btn_Criar_On_Action() {
        // Verifica se os campos de novo nome de utilizador e nova palavra-passe estão vazios
        if (txt_new_Username.getText().isEmpty()
                || txt_new_Password.getText().isEmpty()){
            // Mostra uma mensagem de erro se algum campo estiver vazio
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos");
            alert.showAndWait();
        }
        else {
            // Obtém o novo nome de utilizador
            String novoUser = txt_new_Username.getText();
            // Verifica se o novo nome de utilizador já existe na lista de contas
            if (ListaContas.stream().anyMatch(c -> Objects.equals(c.getUsername(), novoUser))) {
                // Mostra uma mensagem de erro se o nome de utilizador já foi inserido
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Esse Username já foi inserido");
                alert.showAndWait();
            } else {
                // Obtém o novo nome de utilizador e a nova palavra-passe
                String novoNome = txt_new_Username.getText();
                String novoPass = txt_new_Password.getText();
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Criar");
                // Adiciona botões personalizados em português
                ButtonType botaoSim = new ButtonType("Sim");
                ButtonType botaoNao = new ButtonType("Não");
                alert.getButtonTypes().setAll(botaoSim, botaoNao);
                // Mostra o alerta de confirmação e aguarda a escolha do utilizador
                Optional<ButtonType> choose = alert.showAndWait();
                // Se o utilizador escolher "Sim"
                if (choose.get() == botaoSim) {
                    // Adiciona a nova conta à lista de contas
                    ListaContas.add(new Login(novoNome,novoPass));
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("Information");
                    alert1.setHeaderText(null);
                    alert1.setContentText("A sua Conta foi Criada com Sucesso");
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
        }
    }

}
