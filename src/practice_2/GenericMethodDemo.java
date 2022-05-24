/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

/**
 *
 * @author Hershy_Tabak
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};
        
        GenericMethodDemo.<Integer>print(integers);
        print(strings);
    }
    
    public static <E> void print(E[] list) {
        for (E list1 : list) {
            System.out.println(list1 + " ");
            System.out.println();          
        }
    }
}
