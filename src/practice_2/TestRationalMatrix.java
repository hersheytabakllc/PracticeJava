/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

import practice.Rational;

/**
 *
 * @author Hershy_Tabak
 */
public class TestRationalMatrix {

    public static void main(String[] args) {
        Rational[][] m1 = new Rational[3][3];
        Rational[][] m2 = new Rational[3][3];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                m1[i][j] = new Rational(i + 1, j + 5);
                m2[i][j] = new Rational(i + 1, j + 6);
            }
        }
        
        RationalMatrix rationalMatrix = new RationalMatrix();
        
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, rationalMatrix.addMatrix(m1, m2), '+');
        
        System.out.println("\nm1 8 m2 is ");
        GenericMatrix.printResult(m1, m2, rationalMatrix.multiplyMatrix(m1, m2), '*');

    }
}
