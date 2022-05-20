/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Owner
 */
public class ShowImage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Pane pane = new HBox(10);
       pane.setPadding(new Insets(5, 5, 5, 5));
       Image image = new Image("image/ESTHERWEISBERG_img_8399.jpg");
       ImageView imageView = new ImageView(image);
       imageView.setFitHeight(100);
       imageView.setFitWidth(100);
       pane.getChildren().add(imageView);
       ImageView imageView2 = new ImageView(image);
       imageView2.setFitHeight(150);
       imageView2.setFitWidth(100);
       pane.getChildren().add(imageView2);
       
       ImageView imageView3 = new ImageView(image);
       imageView3.setFitHeight(100);
       imageView3.setFitWidth(100);
       imageView3.setRotate(90);
       pane.getChildren().add(imageView3);
       
       Scene scene = new Scene(pane);
       primaryStage.setTitle("ShowImage");
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
