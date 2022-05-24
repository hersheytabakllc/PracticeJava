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
public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;
    
    public Course(String courseName) {
        courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            /*if(students[i].equals(student){
                students
            })*/
        }
    }
}
