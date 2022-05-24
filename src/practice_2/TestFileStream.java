/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

import java.io.*;

/**
 *
 * @author Hershy_Tabak
 */
public class TestFileStream {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("temp.dat");) {
            for (int i = 0; i <= 10; i++) {
                output.write(i);
            }
        }
        try (
                FileInputStream input = new FileInputStream("temp.dat");
                ) {
            int value;
            while ((value = input.read()) != -1) 
                System.out.print(value + " ");
        }
    }
}