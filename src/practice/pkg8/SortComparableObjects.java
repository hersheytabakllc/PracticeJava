/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg8;
import java.math.*;
/**
 *
 * @author Owner
 */
public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.println(city + "");
        System.out.println();
        
        BigInteger[] hugeNumbers = {new BigInteger("23232310929239929"), new BigInteger("43223232399292"),
            new BigInteger("54623239292")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers)
            System.out.print(number + " ");
    }
}
