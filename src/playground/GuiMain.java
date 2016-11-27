package playground;

import javafx.application.Application;
import javafx.stage.Stage;
import playground.ui.GoogleMap;
import playground.ui.Stopwatch;

public class GuiMain extends Application{
    public static void init(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // primaryStage = new Greeter();
//        primaryStage = new GoogleMap();
        primaryStage = new Stopwatch();
        primaryStage.show();
    }
}
