package com.haruna;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int subtract = num1 - num2;

        System.out.println("Sum " + sum);
        System.out.println("Product " + product);
        System.out.println("Subtract " + subtract);
    }
}
