/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Hershy_Tabak
 */
public class DirectorySize {
    public static void main(String[] args) {
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        
        System.out.println(getSize(new File(directory)) + " bytes");
    }
    
    public static long getSize(File file) {
        long size = 0;
        
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i =0; files != null && i < files.length; i++) {
                size += getSize(files[i]);
            }
        }
        else {
            size += file.length();
        }
        return size;
    }
}
