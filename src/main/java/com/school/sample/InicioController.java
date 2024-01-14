package com.school.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class InicioController{
    @FXML
    private Button btnEntrar;

    public void entrar(ActionEvent actionEvent) throws Exception {
        Parent scene = FXMLLoader.load(getClass().getResource("Principal1.fxml"));
        Stage voltar = new Stage();
        //Definições da Stage
        voltar.setTitle("");
        voltar.setResizable(false);
        voltar.initOwner(Settings.getPrimaryStage());
        voltar.initModality(Modality.WINDOW_MODAL);
        voltar.setScene(new Scene(scene));
        Window window = btnEntrar.getScene().getWindow();
        window.hide();
        voltar.show();
    }
}
