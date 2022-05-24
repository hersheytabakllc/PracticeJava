/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Hershy_Tabak
 */
public class Copy {
    public static void main(String[] args) throws IOException{
        if (args.length != 2) {
            System.out.println("Usuage: java Copy sourceFile targetFile");
            System.exit(1);
        }
        
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[1] + " does not exist");
            System.exit(3);
        }
        
        try (
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
                
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
                ) {
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte)r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}
