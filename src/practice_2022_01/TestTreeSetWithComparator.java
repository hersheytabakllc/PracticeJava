/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2022_01;

import java.util.Set;
import java.util.TreeSet;
import practice.CircleFromSimpleGeometricObject;
import practice.GeometricObject;
import practice.RectangleFromSimpleGeometricObject;
import practice_12_2021.GeometricObjectComparator;

/**
 *
 * @author Hershy_Tabak
 */
public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new RectangleFromSimpleGeometricObject(4, 5));
        set.add(new CircleFromSimpleGeometricObject(40));
        set.add(new CircleFromSimpleGeometricObject(40));
        set.add(new RectangleFromSimpleGeometricObject(4, 1));
        
        System.out.println("A sorted set of geomatric objects");
        for (GeometricObject element : set) {
            System.out.println("area = " + element.getArea());
        }
    }
}
