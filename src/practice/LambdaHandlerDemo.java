/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

/**
 *
 * @author Hershy_Tabak
 */
public class LambdaHandlerDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);
        
        btNew.setOnAction((ActionEvent e) -> {
                System.out.println("Process new");
        });
        
        btOpen.setOnAction(e -> System.out.println("Process open"));
        
        btSave.setOnAction((e) -> {
                System.out.println("Process Save");
        });
        
        btPrint.setOnAction(e -> {
                System.out.println("Process Print");
        });
        
        Scene scene = new Scene(hBox, 300, 50);    
        primaryStage.setTitle("LambdaHandlerDemo");
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
