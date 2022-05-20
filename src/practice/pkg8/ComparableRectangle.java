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
public class ComparableRectangle extends RectangleFromSimpleGeometricObject implements Comparable<ComparableRectangle> {
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() > o.getArea())
            return -1;
        else
            return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}
