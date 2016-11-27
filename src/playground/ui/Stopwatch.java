package playground.ui;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by aaron on 11/27/16.
 */
public class Stopwatch extends Stage{
    private GridPane root = new GridPane();
    private Scene scene = new Scene(root, 300, 200);
    private Label timeDisplay = new Label("00:00:00.000");
    private Button start = new Button("Start");
    private Button stop = new Button("Stop");
    private Button reset = new Button("Reset");
    private int timeElaspe = 0; // in millseconds
    private Timeline timeline;

    public Stopwatch() {
        timeline = new Timeline(new KeyFrame(
                Duration.millis(1),
                ae -> dispalyTime())
        );
        timeline.setCycleCount(Animation.INDEFINITE);

        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.add(timeDisplay, 0, 0, 3, 1);
        root.add(start, 0, 1);
        root.add(stop, 1, 1);
        root.add(reset, 2, 1);

//        timeDisplay.setAlignment(Pos.CENTER);
        timeDisplay.setPrefWidth(200);
        timeDisplay.setFont(new Font("Arial", 30));

//        start.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                dispalyTime();
//            }
//        });

        start.setOnAction((event) -> timeline.play());

        stop.setOnAction(event -> timeline.pause());

        reset.setOnAction(event -> {
            timeline.stop();
            timeDisplay.setText("00:00:00.000");
            timeElaspe = 0;
        });

        this.setTitle("Stopwatch");
        this.setScene(scene);

    }

    private void dispalyTime() {
        int seconds = timeElaspe/1000;
        int microseconds = timeElaspe%1000;
        int minutes = seconds/60;
        int hours = minutes/60;
        String timeText = String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, microseconds);
        this.timeDisplay.setText(timeText);
        timeElaspe++;
    }

}
