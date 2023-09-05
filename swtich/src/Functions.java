import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Sum();
    }

    static void Sum(){
       Scanner in = new Scanner(System.in);
       int num1, num2, result;

        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        result = num1 + num2;
        System.out.println("The sum = " + result);
    }
}
