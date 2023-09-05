import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 120}
        };

        int target = 3; // [1, 2]
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                   return new int[]{row, col};
                }
            }
        }

        return new int[] {-1, -1};
    }

    static int max(int[][] arr){
        int maxVal = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > maxVal) {
                    maxVal = element;
                }
            }
        }

        return maxVal;
    }
}

