public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       swapper(a, b);
    }

    static void swapper(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }
}
