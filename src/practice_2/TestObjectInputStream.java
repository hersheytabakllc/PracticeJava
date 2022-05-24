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
public class TestObjectInputStream {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"))) {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(name + " " + score + " " + date);
        }
    }
}
