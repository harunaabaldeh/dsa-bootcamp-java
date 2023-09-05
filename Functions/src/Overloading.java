public class Overloading {
    public static void main(String[] args) {
        fun(45);
        fun("mike");
        sum(1, 2);
        sum(1, 2, 3);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + b;
    }
    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int x){
        System.out.println(x);
    }
}
