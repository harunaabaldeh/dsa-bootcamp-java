package com.haruna;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count <= n){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
        int firstNumber = 0;
        int secondNumber = 1;
        int count = 2;
        while (count <= userNumber){
            int temp = secondNumber;
            secondNumber = secondNumber + firstNumber;
            firstNumber = temp;
            count++;
        }
    }

}
