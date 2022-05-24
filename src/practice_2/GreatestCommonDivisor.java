/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2;

/**
 *
 * @author Hershy_Tabak
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int gcd = gcd(60000000, 2647);
        
        System.out.println("test: " + gcd);
        
          long startTime = System.currentTimeMillis();
        System.out.println("Greatest common divisor " + gcd(15, 17));
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds to calculate the Greatest common divisor");
        
        startTime = System.currentTimeMillis();
        System.out.println("Greatest common divisor " + newGcd(15, 17));
        endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds to calculate the new Greatest common divisor");
        
    }

    private static int gcd(int m, int n) {
        int gcd = 1;
        
        for (int k = 2; k <= m && k <= n; k++) {
            if (m % k == 0 && n % k == 0)
                gcd = k;
        }
        return gcd;
    }
    
       private static int newGcd(int m, int n) {
        int gcd = 1;
        
        for (int k = n; k >= 1; k--) {
            if (m % k == 0 && n % k == 0)
                gcd = k;
        }
        return gcd;
    }
}
