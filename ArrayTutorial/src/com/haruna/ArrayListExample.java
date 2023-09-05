package com.haruna;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(22);
        list.add(11);
        list.add(99);
        list.add(65);

        System.out.println(list);
    }
}
