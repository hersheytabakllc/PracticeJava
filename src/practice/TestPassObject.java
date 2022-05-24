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
public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle =
                new CircleWithPrivateDataFields(1);
        int n = 5;
        printaAreas(myCircle, n);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    private static void printaAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
       while (times >= 1) {            
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
