package com.haruna;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 333;
        arr[3] = 63;
        arr[4] = 233;
//        System.out.println(Arrays.toString(arr));
        // internally this is like [23, 34, 333, 63, 233]
//        System.out.println(arr[2]);
        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println("==============");
//        for (int j : arr) {
//            System.out.println(j);
//        }
        // array of objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
