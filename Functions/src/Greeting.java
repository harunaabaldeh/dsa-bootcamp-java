import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        String msg = Greet(name);
        System.out.println(msg);
    }

    static String Greet(String name) {
        String msg = "Hello " + name;

        return msg;
    }
}
