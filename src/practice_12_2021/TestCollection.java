/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_12_2021;

import java.util.*;

/**
 *
 * @author Hershy_Tabak
 */
public class TestCollection {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dellas");
        collection1.add("Medison");
        System.out.println("A list of cities in colletion1:");
        System.out.println(collection1);
        
        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dellas"));
        
        collection1.remove("Dellas");
        System.out.println("\n" + collection1.size() + " cities are in collection1 now");
        
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angles");
        collection2.add("Atlanta");
        
        System.out.println("\nA lilst of cities on collection2:");
        System.out.println(collection2);
        
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);
        
        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2: ");
        System.out.println(c1);
        
        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\nCities in collection1, but ont in collectin2: ");
        System.out.println(c1);
       
    }
}
