/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author Hershy_Tabak
 */
public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i -1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement; 
        }
    }
    
    public static void main(String[] args) {
        int[] list ={18, 11, 2, 7, 3, 9};
        insertionSort(list);
        System.out.println("sorted = " + Arrays.toString(list));
    }
}
