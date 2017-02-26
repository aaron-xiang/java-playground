package playground.ui;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by aaron on 11/23/16.
 */
public class GuiHelloWorld extends Stage {
    public GuiHelloWorld() {
        Label label = new Label("Hello World");
        StackPane stackpane = new StackPane();
        stackpane.getChildren().add(label);
        Scene scene = new Scene(stackpane, 200, 150);
        this.setScene(scene);
        this.setTitle("Hello World");
    }
}
