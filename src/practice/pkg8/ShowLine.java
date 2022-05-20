/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg8;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Owner
 */
public class ShowLine extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new LinePane(), 200, 200);
        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    class LinePane extends Pane {

        public LinePane() {
            Line line1 = new Line(10, 10, 10, 10);
            line1.endXProperty().bind(widthProperty().subtract(10));
            line1.endYProperty().bind(heightProperty().subtract(10));
            line1.setStrokeWidth(5);
            line1.setStroke(Color.GREEN);
            getChildren().add(line1);
        }
    }

}
