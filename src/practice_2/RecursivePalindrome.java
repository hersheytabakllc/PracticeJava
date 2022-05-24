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
public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }
    
    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }
    
    private static void checkIsPalindrome(String s) {
        System.out.println("Is " + s + " a palindrome? " + isPalindrome(s));
    }
    
    public static void main(String[] args) {
        checkIsPalindrome("moon");
        checkIsPalindrome("noon");
        checkIsPalindrome("a");
        checkIsPalindrome("ava");
        checkIsPalindrome("ab");
    }
}
