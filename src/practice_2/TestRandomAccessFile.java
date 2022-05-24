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
public class TestRandomAccessFile {

    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile inout = new RandomAccessFile("input.dat", "rw");) {
            inout.setLength(0);

            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
            }

            System.out.println("Current file length is " + inout.length());

            inout.seek(0);
            System.out.println("The first number is " + inout.readInt());

            inout.seek(1 * 4);
            System.out.println("The second number is " + inout.readInt());

            inout.seek(9 * 4);
            System.out.println("The tenth number is " + inout.readInt());

            inout.writeInt(555);

            inout.seek(inout.length());
            inout.writeInt(999);

            System.out.println("The new length is " + inout.length());

            inout.seek(10 * 4);
            System.out.println("The eleventh number is " + inout.readInt());
        }
    }
}
