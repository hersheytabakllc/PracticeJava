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
public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {new ComparableRectangle(3.4, 5.4), new ComparableRectangle(13.24, 55.4),
            new ComparableRectangle(7.4, 35.4), new ComparableRectangle(1.4, 24.4)};
        java.util.Arrays.sort(rectangles);
        for (RectangleFromSimpleGeometricObject rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}
