import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int result = sum1(1, 2);
        System.out.println(result);
    }

    static int sum1(int a, int b){
        int sum = a + b;

        return sum;
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();

        result = num1 + num2;

        return result;
    }
}
