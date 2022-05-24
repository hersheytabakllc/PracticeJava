/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author Hershy_Tabak
 */
public class BallPane extends Pane {
    public final double radius = 20;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius);
    private Timeline animation;
    
    public BallPane() {
        circle.setFill(Color.GREEN);
        getChildren().add(circle);
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.play();
    }
    
    public void play() {
        animation.play();
    }
    
    public void pause() {
        animation.pause();
    }
    
    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 0.1);
    }
    
    public void decreaseSpeed() {
        animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }
    
    protected void moveBall() {
        if (x < radius || x > getWidth() - radius) {
            dx *= -1;
        }
        if (y < radius || y > getHeight() - radius) {
            dy *= -1;
        }
        
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }

}
