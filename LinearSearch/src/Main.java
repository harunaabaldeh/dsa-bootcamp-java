public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        boolean myTarget = search(arr, target);
        System.out.println(myTarget);
    }
    static boolean search(int[] arr, int target){
        int count = 0;
        for (int j : arr) {
            if (j == target) {
                return true;
            }
            count++;
        }

        return false;
    }
}