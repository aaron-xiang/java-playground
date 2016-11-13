package playground.ui;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GoogleMap extends Stage {
    private final String apiKey = "AIzaSyBP7swTIZPez0hLC13Srp9o0JPod3ttqkY";
    private int mapHeight = 550, mapWidth = 750;
    private TextField input;
    private ImageView imageView;
    private Button btn;
    private Slider slider;
    private Label zoomLevel;
    private Scene scene;

    public GoogleMap() {
        input = new TextField();
        input.setPromptText("Input location");
        input.setPrefWidth(300);
        input.setOnAction(event -> getMap(event));

        btn = new Button("Get Map");
        btn.defaultButtonProperty().bind(btn.focusedProperty());
        btn.setOnAction(event -> getMap(event));

        imageView = new ImageView();
        imageView.setFitHeight(mapHeight);
        imageView.setFitWidth(mapWidth);

        slider = new Slider(0, 10, 5);
        slider.setPrefWidth(400);
        slider.setMajorTickUnit(1.0);
        slider.setMinorTickCount(0);
        slider.setSnapToTicks(true);
        slider.setBlockIncrement(1.0);
        zoomLevel = new Label(Double.toString(slider.getValue()));
        slider.valueProperty().addListener((observable, oldValue, newValue) -> setZoomLevel(observable, oldValue, newValue));

        HBox top = new HBox(10);
        top.getChildren().addAll(input, btn);
        top.setAlignment(Pos.CENTER);

        HBox bottom = new HBox(10);
        bottom.getChildren().addAll(new Label("Zoom:"), slider, zoomLevel);
        bottom.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setTop(top);
        root.setCenter(imageView);
        root.setBottom(bottom);

        scene = new Scene(root, mapWidth+50, mapHeight+50);
        this.setTitle("Google Map");
        this.setScene(scene);
    }

    private void getMap() {
        String address = input.getText();
        Integer zoom = (int) slider.getValue() + 10;
        Map<String, String> params = new HashMap<>();
        params.put("key", apiKey);
        params.put("center", address);
        params.put("size", mapWidth + "x" + mapHeight);
        params.put("zoom", zoom.toString());
        params.put("scale", "2");
        params.put("markers", "color:red|lable:S|" + address);
        String urlParams = params
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + urlEncode(entry.getValue()))
                .collect(Collectors.joining("&"));

        String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?" + urlParams;
        System.out.println(imageUrl);
        Image image = new Image(imageUrl, mapWidth, mapHeight, true, false);
        imageView.setImage(image);
    }

    private void getMap(ActionEvent event) {
        event.consume();
        getMap();
    }

    private void setZoomLevel(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
        zoomLevel.setText(Double.toString(slider.getValue()));
        getMap();
    }

    private String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
