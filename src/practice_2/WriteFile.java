/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Hershy_Tabak
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("temp.dat");) {
            for (int i = 8; i <= 10; i++) {
                output.write(i);
            }
        }
    }

}
