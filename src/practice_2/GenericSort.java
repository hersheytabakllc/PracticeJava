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
public class GenericSort {

    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 3};

        Double[] doubleArray = {3.4, 1.3, -22.1};

        Character[] charArray = {'a', 'J', 'r'};

        String[] stringArray = {"Tom", "Susan", "Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        System.out.println("Sorted Integers objects: ");
        printList(intArray);
        System.out.println("Sorted Double objects: ");
        printList(doubleArray);
        System.out.println("Sorted Character objects: ");
        printList(charArray);
        System.out.println("Sorted String objects: ");
        printList(stringArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentIndex;

        for (int i = 0; i < list.length; i++) {
            currentMin = list[i];
            currentIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (Object list1 : list) {
            System.out.println(list1 + " ");
            System.out.println("");
        }
    }
}
