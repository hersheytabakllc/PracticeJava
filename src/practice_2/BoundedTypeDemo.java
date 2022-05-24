/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

import practice.CircleFromSimpleGeometricObject;
import practice.GeometricObject;
import practice.RectangleFromSimpleGeometricObject;

/**
 *
 * @author Hershy_Tabak
 */
public class BoundedTypeDemo {
    public static void main(String[] args) {
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 2);
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(2);
        
        System.out.println("Same area? " + equalArea(rectangle, circle));
    }
    
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }
} 
