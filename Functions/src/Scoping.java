public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "mike";

        {
            a = 30;
            name = "Joe";
        }
        System.out.println(a);
        System.out.println(name);

        //scoping in for loops
        for(int i = 0; i < 4; i++){
            System.out.println(i);
        }
//        System.out.println(i); i is not access outside the scope of the function
    }

    static void random(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        // all parameters and variables define in this function are not available outside
        // the function ie it cannot be use outside the function scope
    }
}
