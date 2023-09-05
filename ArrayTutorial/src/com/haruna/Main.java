package com.haruna;

public class Main {
    public static void main(String[] args) {
        //data_type [] arrayName = new data_type[size];
        int[] numbers = new int[5];

        String[] names;  //declaration: added this to the stack memory at this point
        names = new String[3]; // initialization: added to head memory at this point
        String[] people = new String[3];
        System.out.println(people[0]);

        String name = null;
        int num = 0;
    }
}