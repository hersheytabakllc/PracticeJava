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
public class Test {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new
            CircleWithPrivateDataFields(5.0);
        printCircle(myCircle);
    }

    private static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of the circle of radius "
                + c.getRadius() + " is " + c.getArea());
    }
}
