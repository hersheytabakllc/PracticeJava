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
public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;
    
    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }
    public int getId() {
        return id;
    }
    public double getArea() {
        return area;
    }
    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        if (area < o.getArea())
            return -1;
        else
            return 0;
    }
}
