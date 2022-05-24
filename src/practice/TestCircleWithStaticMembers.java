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
public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects is " +
                CircleWithStaticMembers.numberOfObjects);
        
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" +
                CircleWithStaticMembers.numberOfObjects + ")");
        
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        //CircleWithStaticMembers.numberOfObjects = 0;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" +
                c1.numberOfObjects + ")");
        System.out.println("c2: radius(" + c2.radius +
                ") and number of Cirle objects (" +
                c2.numberOfObjects + ")");
    }
}
