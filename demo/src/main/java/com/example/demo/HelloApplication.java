package com.example.demo;
import com.example.demo.clases.ventana2;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creación de los componentes
        Label nameLabel = new Label("Nombre:");
        TextField nameField = new TextField();
        Button greetButton = new Button("Saludar");
        Label greetingLabel = new Label();
        // se configura el evento al presionar el botón
        greetButton.setOnAction(e -> {
            String nombre = nameField.getText();
            greetingLabel.setText("¡Hola, " + nombre + "!");
        });
        // TextArea: Área de texto para ingreso de texto multilínea
        TextArea textArea = new TextArea();
        textArea.setPromptText("Escribe aquí...");

        // ChoiceBox: Caja de selección con opciones predefinidas
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Opción 1", "Opción 2", "Opción 3");
        choiceBox.setValue("Opción 1");

        // ComboBox: Caja de selección con posibilidad de búsqueda
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Elemento 1", "Elemento 2", "Elemento 3");
        comboBox.setEditable(true); // Permite al usuario ingresar texto

        // RadioButton: Botones de radio para seleccionar una opción entre varias
        RadioButton radioButton1 = new RadioButton("Opción 1");
        RadioButton radioButton2 = new RadioButton("Opción 2");
        RadioButton radioButton3 = new RadioButton("Opción 3");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);

        // CheckBox: Cuadros de verificación para seleccionar opciones múltiples
        CheckBox checkBox1 = new CheckBox("Opción 1");
        CheckBox checkBox2 = new CheckBox("Opción 2");
        CheckBox checkBox3 = new CheckBox("Opción 3");

        // ProgressBar: Barra de progreso para mostrar el avance de una tarea
        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.5);

        // Slider: Desplazamiento para seleccionar un valor numérico dentro de un rango
        Slider slider = new Slider(0, 100, 50);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);

        // TableView: Tabla de vista para mostrar datos en forma tabular
        TableView<String> tableView = new TableView<>();
        TableColumn<String, String> column = new TableColumn<>("Columna");
        tableView.getColumns().add(column);

        // TreeView: Árbol de vista para mostrar datos en forma jerárquica
        TreeItem<String> rootItem = new TreeItem<>("Raíz");
        TreeView<String> treeView = new TreeView<>(rootItem);

        // MenuItem: Elemento de menú para acceder a una acción u opción
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menú");
        MenuItem menuItem1 = new MenuItem("Opción 1");
        MenuItem menuItem2 = new MenuItem("Opción 2");
        menu.getItems().addAll(menuItem1, menuItem2);
        menuBar.getMenus().add(menu);

        // Tooltip: Mensaje emergente que muestra información adicional
        Tooltip tooltip = new Tooltip("Este es un Tooltip");
        Button tooltipButton = new Button("Botón con Tooltip");
        Tooltip.install(tooltipButton, tooltip);

        // Alert: Mensaje emergente para mostrar un mensaje o solicitar una respuesta
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText("¡Esto es un mensaje de alerta!");

        // Configurar el evento al hacer clic en el botón con Tooltip
        tooltipButton.setOnAction(e -> alert.showAndWait());

        // Crear el diseño de la ventana
        VBox root = new VBox(10);
        root.getChildren().addAll(nameLabel, nameField, greetButton, greetingLabel,
                textArea,
                new Label("ChoiceBox:"), choiceBox,
                new Label("ComboBox:"), comboBox,
                new Label("RadioButtons:"), radioButton1, radioButton2, radioButton3,
                new Label("CheckBoxes:"), checkBox1, checkBox2, checkBox3,
                new Label("ProgressBar:"), progressBar,
                new Label("Slider:"), slider,
                new Label("TableView:"), tableView,
                new Label("TreeView:"), treeView,
                menuBar,
                new Label("Tooltips:"), tooltipButton);

        root.setMinSize(800, 800);
        root.setStyle("-fx-padding: 20px; -fx-alignment: center;");
        // Crear la escena
        Scene scene = new Scene(root);

        // Configurar la ventana principal
        primaryStage.setTitle("JavaFX Components Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
// Agregar DatePicker
        DatePicker datePicker = new DatePicker();

// Configurar el evento para obtener la fecha seleccionada
        datePicker.setOnAction(e -> {
            LocalDate selectedDate = datePicker.getValue();
            System.out.println("Fecha seleccionada: " + selectedDate);
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}