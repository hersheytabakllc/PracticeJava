/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg8;

/**
 *
 * @author Owner
 */
public class TestHouse {
    public static void main(String[] args) throws CloneNotSupportedException{
        House house1 = new House(4, 5);
        Object house2 = house1.clone();
        System.out.println("house1 " + house1.getArea() + house2);
    }
}
