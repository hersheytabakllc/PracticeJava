/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Hershy_Tabak
 */
public class ListViewDemo extends Application {

    private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
        "United Kingdom", "United States of America"};

    private ImageView[] ImageViews = {new ImageView("file:image/ca.png"),
        new ImageView("file:image/china.png"),
        new ImageView("file:image/denmark.png"),
        new ImageView("file:image/fr.png"),
        new ImageView("file:image/germany.png"),
        new ImageView("file:image/india.png"),
        new ImageView("file:image/norway.png"),
        new ImageView("file:image/uk.png"), new ImageView("file:image/us.png")};

    @Override
    public void start(Stage primaryStage) {
        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
        lv.setPrefSize(400, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        FlowPane imagePane = new FlowPane(10, 10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);

        lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
            imagePane.getChildren().clear();
            for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
                imagePane.getChildren().add(ImageViews[i]);
            }
        });

        Scene scene = new Scene(pane, 450, 170);

        primaryStage.setTitle("ListViewDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
