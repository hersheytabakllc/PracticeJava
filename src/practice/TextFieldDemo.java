/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;


/**
 *
 * @author Hershy_Tabak
 */
public class TextFieldDemo extends RadioButtonDemo {
    
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();
        
        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new message: "));
        
        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_LEFT);
//        tf.setEditable(false);
        paneForTextField.setCenter(tf);
        pane.setTop(paneForTextField);
        
        tf.setOnAction(e -> text.setText(tf.getText()));
        
        return pane;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
