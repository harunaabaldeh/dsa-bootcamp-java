import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId  = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Mike Jane");
            case 2 -> System.out.println("John");
            case 3 -> {
                System.out.println("Foo");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("Invalid department");
                }
            }
            default -> System.out.println("Enter a valid employee ID");
        }
    }
}
