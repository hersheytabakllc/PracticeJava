/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;
        
        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");      
        }
    }
}
