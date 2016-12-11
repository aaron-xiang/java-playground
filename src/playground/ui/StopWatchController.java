package playground.ui;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class StopWatchController {
    @FXML
    private Label timeDisplay;
    private Timeline timeline;
    private int timeElapsed = 0;

    private void showTime() {
        int ms = timeElapsed % 1000;
        int s = timeElapsed / 1000;
        int m = s / 60;
        int h = m / 60;
        String t = String.format("%02d:%02d:%02d.%03d", h, m, s, ms);
        this.timeDisplay.setText(t);
    }

    @FXML
    public void start() {
        timeline = new Timeline(new KeyFrame(Duration.millis(1),
                event -> {
                    this.timeElapsed += 1;
                    showTime();
                }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    @FXML
    public void stop() {
        this.timeline.stop();
    }

    @FXML
    public void reset() {
        this.timeElapsed = 0;
        this.timeDisplay.setText("00:00:00.000");
    }
}
