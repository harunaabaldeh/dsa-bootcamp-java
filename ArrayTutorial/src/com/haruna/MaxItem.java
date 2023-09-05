package com.haruna;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {100, 200, 2, 3, 400};
        int maxValueInArr = max(arr);
        System.out.println(maxValueInArr);
        int maxValInRange = maxValueInRange(arr, 0, 3);
        System.out.println(maxValInRange);
    }

    static int max(int[] arr){
        int maxVal = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxValueInRange(int[] arr, int start, int end){
        if (end < start || arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i < end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
