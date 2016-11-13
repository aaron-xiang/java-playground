package playground.ui;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Greeter extends Stage {
    private TextField textField;
    private Button button;
    private Label label;
    Scene scene;

    public Greeter() {
        label = new Label("Hello JavaFX!");
        textField = new TextField();
        textField.setPromptText("Input location");
        textField.setOnAction(event -> greet(event));

        button = new Button("Greet");
        button.defaultButtonProperty().bind(button.focusedProperty());
        button.setOnAction(event -> greet(event));

        Pane root = new VBox(20);
        Pane top = new HBox(10);
        top.getChildren().addAll(textField, button);
        root.getChildren().addAll(top, label);

        scene = new Scene(root, 400, 325);
        this.setTitle("Google Map");
        this.setScene(scene);
    }

    private void greet(ActionEvent event) {
        label.setText("Hello " + textField.getText() + "!");
    }
}
