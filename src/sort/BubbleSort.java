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
public class BubbleSort {
    public static void bubbleSort(int[] list) {
        boolean needsNextPass = true;
        for (int k = 1; k < list.length && needsNextPass; k++) {
            needsNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needsNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        System.out.println("BubbleSort = " + Arrays.toString(list));
    }
}
