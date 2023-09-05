import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7);

        multiple(1, 2, "Mike", "Joe");
    }

    static void multiple(int a, int b, String ...names){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
