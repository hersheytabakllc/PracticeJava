/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_12_2021;

import java.util.*;

/**
 *
 * @author Hershy_Tabak
 */
public class TestArrayAndLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 3);
        arrayList.add(3, 30);

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forwared:");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        
        System.out.println("Display the linked list backward:");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {            
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
    }
}