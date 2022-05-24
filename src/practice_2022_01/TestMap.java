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
public class TestMap {
    public static boolean test;
    
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 30);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 30);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        
        System.out.println("\nThe age for Lewis is " + linkedHashMap.get("Lewis"));
        
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);
       
        System.out.println("test = " + test);
    }
    public void setTest(boolean b) {
        test = b;
    }
}
