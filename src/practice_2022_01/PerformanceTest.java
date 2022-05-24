/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2022_01;

import jdk.nashorn.internal.objects.NativeDate;

/**
 *
 * @author Hershy_Tabak
 */
public class PerformanceTest {

    public static void main(String[] args) {

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                getTime(10);
                getTime(100);
                getTime(1000);
                getTime(10000);
                getTime(50000);
            }
        });
        
        thread.setPriority(1);
        
        thread.start();
        
//        getTime(10);
//        getTime(100);
//        getTime(1000);
//        getTime(10000);
//        getTime(50000);
//        getTime(1000000);
//        getTime(10000000);
//        getTime(100000000);
//        getTime(1000000000);
    }

    private static void getTime(long n) {
        long startTime = System.currentTimeMillis();
        long k = 0;
//        for (int i = 1; i <= n; i++) {
//            k = k + 5;
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k = k + i + j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n + " is " + (endTime - startTime) + " milliseconds");
    }
}
