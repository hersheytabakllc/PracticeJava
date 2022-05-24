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
public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException{
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
                ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }
}
