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
public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoObject1 = new CircleFromSimpleGeometricObject(5);
        GeometricObject geoObject2 = new RectangleFromSimpleGeometricObject(5, 3);
        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));
        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);
    }
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
