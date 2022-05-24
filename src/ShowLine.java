/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

/**
 *
 * @author Hershy_Tabak
 */
public class ShowLine extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Scene scene = new Scene(new LinePane(), 300, 250);
        
        primaryStage.setTitle("Show Line");
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
            line1.endYProperty().bind(heightProperty().subtract(50));
            line1.setStrokeWidth(5);
            line1.setStroke(Color.RED);
            getChildren().add(line1);
            
            Line line2 = new Line(10, 10, 10, 10);
            line2.startXProperty().bind(widthProperty().subtract(10));
            line2.endYProperty().bind(heightProperty().subtract(10));
            line2.setStrokeWidth(5);
            line2.setStroke(Color.GREEN);
            getChildren().add(line2);
        }
    }
    
}
