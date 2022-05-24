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
public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;
   public Student(int ssn, String newName) {
       id = ssn;
       name = newName;
       dateCreated = new java.util.Date();
   }
   
   public int getId() {
       return id;
   }
   
   public String getName() {
       return name;
   }
   
   public java.util.Date getDateCreated() {
       return dateCreated;
   }
}
