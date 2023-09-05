public class BSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 4;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // find the mid ele
            //int mid = (start + end) / 2; // this might exceed the int range limit
            int midEl = start + (end - start) / 2;
            if(target < arr[midEl]){
                end = midEl - 1;
            } else if (target > arr[midEl]){
                start = midEl + 1;
            } else {
                return midEl;
            }
        }
        return -1;
    }
}