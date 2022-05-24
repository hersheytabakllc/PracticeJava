/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2022_01;

import java.util.*;

/**
 *
 * @author Hershy_Tabak
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("Beijing");
        set.add("New York");
        
        System.out.println(set);
        
        for (String string : set) {
            System.out.println(string.toUpperCase() + " ");
        }
    }
}
