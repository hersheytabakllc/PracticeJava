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
public class TestDataStream {
    public static void main(String[] args) throws IOException{
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
                ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
        try (
                DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
                ) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}