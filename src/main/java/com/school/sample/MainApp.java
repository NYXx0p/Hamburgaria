package com.school.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        //1º PASSO - O método Start associa este Layout a um objeto da classe Parent.
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("Inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vai tomar no Cu");
        Settings.setPrimaryStage(primaryStage);
        Settings.ListaProduto();
        primaryStage.show();
    }
}