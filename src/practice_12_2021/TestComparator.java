/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_12_2021;

import java.util.Comparator;
import practice.CircleFromSimpleGeometricObject;
import practice.GeometricObject;
import practice.RectangleFromSimpleGeometricObject;

/**
 *
 * @author Hershy_Tabak
 */
public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new RectangleFromSimpleGeometricObject(5, 5);
        GeometricObject g2 = new CircleFromSimpleGeometricObject(5);
        
        GeometricObject g = max(g1, g2, new GeometricObjectComparator());
        
        System.out.println("The area of hte larger object is " + g.getArea());
    }

    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
        if (c.compare(g1, g2) > 0)
            return g1;
        else
            return g2;
    }
}
