public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int target = 7;
        int ans = agnostic(arr, target);
        System.out.println(ans);
    }

    static int agnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int midEl = start + (end - start) / 2;

            if(arr[midEl] == target){
                return midEl;
            }

            if (isAsc){
                if (target < arr[midEl]){
                    end = midEl - 1;
                } else {
                    start = midEl + 1;
                }
            } else {
                if (target > arr[midEl]){
                    start = midEl - 1;
                } else {
                    end = midEl + 1;
                }
            }
        }

        return -1;

    }
}
