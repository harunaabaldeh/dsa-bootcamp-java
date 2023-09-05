public class MaxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts){
        int mainMax = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            if (sum > mainMax) {
                mainMax = sum;
            }
        }
         return mainMax;
    }
}
