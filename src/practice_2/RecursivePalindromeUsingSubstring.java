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
public class RecursivePalindromeUsingSubstring {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }

    public static void checkIsPalindrome(String s) {
        System.out.println("Is " + s + " a palindrome? " + isPalindrome(s));
    }

    public static void main(String[] args) {
        checkIsPalindrome("moon");
        checkIsPalindrome("noon");
        checkIsPalindrome("aba");
        checkIsPalindrome("ab");

    }
}
