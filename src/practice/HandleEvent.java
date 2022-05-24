package practice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Hershy_Tabak
 */
public class HandleEvent extends Application {
    final String OK = "OK";
    final String CANCEL = "Cancel";
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button(OK);
        Button btCancel = new Button(CANCEL);
        HandlerClass handler1 = new HandlerClass();
        handler1.setText(OK);
        btOK.setOnAction(handler1);
        HandlerClass handler2 = new HandlerClass();
        handler2.setText(CANCEL);
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK, btCancel);
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    class HandlerClass implements EventHandler<ActionEvent> {
        String status;
        public void setText(String s) {
            status = s;
        }
        @Override
        public void handle(ActionEvent e) {
            System.out.println(status + " button clicked");
        }
    }

//    class CancelHandlerClass implements EventHandler<ActionEvent> {
//        @Override
//        public void handle(ActionEvent e) {
//            System.out.println("Cancel button clicked");
//        }
//    }
}
