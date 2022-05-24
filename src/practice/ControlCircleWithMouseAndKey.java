/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Hershy_Tabak
 */
public class ControlCircleWithMouseAndKey extends Application {
    private  CirclePane circlePane = new CirclePane();
    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);
        
        btEnlarge.setOnAction(e -> circlePane.enlarge());
        btShrink.setOnAction(e -> circlePane.shrink());
        
        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            }else if (e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });
        circlePane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.U) {
                circlePane.enlarge();
            }else if (e.getCode() == KeyCode.D) {
                circlePane.shrink();
            }
        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        borderPane.setAlignment(hBox, Pos.CENTER);
        
        Scene scene = new Scene(borderPane, 200, 150);
        
        primaryStage.setTitle("CirclePane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        circlePane.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
