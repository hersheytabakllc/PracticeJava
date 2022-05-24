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
public class Faculty extends Employee{
    public static void main(String[] args) {
        new Faculty();
    }
    public Faculty() {
        System.out.println("(4) Perform Faculty tasks");
    }
}
class Employee extends Person{
    public Employee() {
        this("(2) Invoke Emploee's overloaded constructor");
        System.out.println("(3) Perform's Employee's tasks ");
    }
    public Employee(String s) {
        System.out.println(s);
    }
}
class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}
