/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Hershy_Tabak
 */
public class ComboBoxDemo extends Application {

    private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
        "United Kingdom", "United States of America"};

    private ImageView[] flagImage = {new ImageView("file:image/ca.png"),
        new ImageView("file:image/china.png"),
        new ImageView("file:image/denmark.png"),
        new ImageView("file:image/fr.png"),
        new ImageView("file:image/germany.png"),
        new ImageView("file:image/india.png"),
        new ImageView("file:image/norway.png"),
        new ImageView("file:image/uk.png"), new ImageView("file:image/us.png")};

    private String[] flagDescription = new String[9];
    private DescriptionPane descriptionPane = new DescriptionPane();

    private ComboBox<String> cbo = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) {
        flagDescription[0] = "The Canadian national flag ...";
        flagDescription[1] = "Description for China ...";
        flagDescription[2] = "Description for Denmark ...";
        flagDescription[3] = "Description for Frence ...";
        flagDescription[4] = "Description for Germany ...";
        flagDescription[5] = "Description for India ...";
        flagDescription[6] = "Description for Norway ...";
        flagDescription[7] = "Description for UK ...";
        flagDescription[7] = "Description for US ...";
        setDispay(0);

        BorderPane pane = new BorderPane();

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");

        ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);
        cbo.setOnAction(e -> setDispay(items.indexOf(cbo.getValue())));

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("ComboBoxDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setDispay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
