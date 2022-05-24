/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2022_01;

import java.util.Scanner;

/**
 *
 * @author Hershy_Tabak
 */
public class ImprovedFibonacci {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();
        
        long startTime = System.currentTimeMillis();
        System.out.println("Fibonacci number at index " + index + " is " + practice_2.ComputeFibonacci.fib(index));
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds to calculate the Fibonacci number");
        
        startTime = System.currentTimeMillis();
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));
        endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds to calculate the Fibonacci number");
    }

    private static long fib(long n) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 2;
        
        if (n == 0)
            return f0;
        else if (n == 1)
            return f1;
        else if (n == 2)
            return f2;
        
        for (int i = 3; i <= n; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }
}
