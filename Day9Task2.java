import java.util.Scanner;

public class Day9Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the task you want to perform --> Add , Subtract, Multiply, Divide");

        String task = sc.nextLine();

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        switch (task) {
            case "Add":
                System.out.println("Addion is: "+(a+b));
                break;
            case "Subtract":
                System.out.println("Subtraction is:"+(a-b));
                break;
            case "Multiply" :
                System.out.println("Multiplication is: "+(a*b));
                break;
            case "Divide" :
                System.out.println("Division is: "+(a/b));
                break;
                
            default:
                System.out.println("!! Wrong Action !!");
            break;
        }
    }
}
