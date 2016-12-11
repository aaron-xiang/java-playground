package playground.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StopWatchFX extends Stage {
    public StopWatchFX() throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("stop-watch-ui.fxml"));
        Scene scene = new Scene(root, 300, 200);
        this.setTitle("Stop Watch");
        this.setScene(scene);
    }
}
