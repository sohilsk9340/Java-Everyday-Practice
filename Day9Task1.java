import java.util.Scanner;

public class Day9Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        
        System.out.println("Enter b value: ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swaping vale of a is: "+a);
        System.out.println("After Swaping vale of b is: "+b);     
    }
}
