/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2022_01;

import java.io.*;
import java.util.*;

/**
 *
 * @author Hershy_Tabak
 */
public class CountKeywords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String filename = input.nextLine();
        
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of keywords in " + filename + " is " + countKeyWords(file));
        } else
            System.out.println("File " + filename + " does not exist");
    }

    private static int countKeyWords(File file) throws FileNotFoundException {
        String[] keywordString = {"abstract", "assert", "boolean", "continue", " default", "do", "break",
                "byte", "case", "catch", "char", "class", "const", "double", "else", "enum", "if", "implements",
                "extends", "for", "final", "finally", "float", "goto", "import", "instanceof", "int", "interface", 
                "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "try", "void", "volatile",
                "while", "true", "false", "null"};
        
        Set<String> keywordset = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;
        
        Scanner input = new Scanner(file);
        
        while (input.hasNext()) {
            String word = input.next();
            if (keywordset.contains(word))
                count++;          
        }
        return count;
    }
}
