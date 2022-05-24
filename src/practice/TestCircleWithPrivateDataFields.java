/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Hershy_Tabak
 */
public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        
        CircleWithPrivateDataFields myCircle = 
                new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());
        
        //myCircle.radius = 6;
        System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());
        //CircleWithPrivateDataFields.numberOfObjects = 0;
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());
        
        System.out.println("The number of objects created is "
        + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
