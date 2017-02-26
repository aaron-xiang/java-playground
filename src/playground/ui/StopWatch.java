package playground.ui;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
 * Created by henry on 11/24/16.
 */
public class StopWatch extends Stage {
    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 300, 200);
    Label timeDisplay = new Label("00:00:00.000");
    Button btnStart = new Button("Start");
    Button btnStop = new Button("Stop");
    Button btnReset = new Button("Reset");
    Timeline timeline;
    int timeElapsed = 0;

    public StopWatch() {
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(timeDisplay, 0, 0, 3, 1);
        grid.add(btnStart, 0, 1);
        grid.add(btnStop, 1, 1);
        grid.add(btnReset, 2, 1);

        timeDisplay.setAlignment(Pos.CENTER);
        timeDisplay.setFont(new Font("Arial", 30));

        timeline = new Timeline(new KeyFrame(Duration.millis(1),
                event -> {
                    this.timeElapsed += 1;
                    showTime();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);

        btnStart.setOnAction(event -> start());
        btnStop.setOnAction(event -> stop());
        btnReset.setOnAction(event -> reset());

        this.setTitle("Stop Watch");
        this.setScene(scene);
    }

    private void showTime() {
        int h = timeElapsed / (3600*1000);
        int m = timeElapsed / (60*1000);
        int s = timeElapsed / 1000;
        int ms = timeElapsed % 1000;
        String t = String.format("%02d:%02d:%02d.%03d", h, m, s, ms);
        this.timeDisplay.setText(t);
    }

    private void start() {
        this.timeline.play();
    }

    private void stop() {
        this.timeline.stop();
    }

    private void reset() {
        this.timeElapsed = 0;
        this.timeDisplay.setText("00:00:00.000");
    }
}
