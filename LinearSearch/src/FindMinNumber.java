public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 3, 4, 5, 6, 7, 8, 9};
        int result = min(arr);
        System.out.println(result);
    }

    static int min(int[] arr){
        if (arr.length == 0){
            return -1;
        }

        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        return minVal;
    }
}
