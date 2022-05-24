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
public class ComputeFactorialTailRecursion {
    public static long factorial(int n) {
        return factorial(n, 1);
    }
    
    private static long factorial(int n, int result) {
        if (n == 0) 
            return result;
        else
            return factorial(n -1, n * result);
    }
}
