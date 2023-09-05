package com.haruna;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {12, 33, 56, 44};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
