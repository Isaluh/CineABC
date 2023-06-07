package com.example.cineabc;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;


public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    void btnTrocarTela(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("teste.fxml"));
            Parent root = loader.load();

            // Obtém a referência para o palco (Stage) atual
            Stage stage = (Stage) welcomeText.getScene().getWindow();

            // Cria uma nova cena com o arquivo FXML desejado
            Scene scene = new Scene(root);

            // Define a nova cena no palco
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void sdadsa(ActionEvent event) {
        System.out.println("teste");
    }

    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

}
