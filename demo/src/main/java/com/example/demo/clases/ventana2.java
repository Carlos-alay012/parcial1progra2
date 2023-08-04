package com.example.demo.clases;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ventana2 extends Stage {
    public ventana2() {
        // Crear los componentes de la segunda ventana
        Label label = new Label("Esta es la segunda ventana");

        // Crear el diseño de la segunda ventana
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Configurar la escena
        Scene scene = new Scene(root, 300, 200);

        // Configurar la ventana
        setTitle("Segunda Ventana");
        setScene(scene);
    }
}