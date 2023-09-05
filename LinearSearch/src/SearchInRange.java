public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 90};
        int result = linearSearch(arr, 90, 1, 5);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = start; index <= end; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        // if the target is not find
        return -1;
    }
}
