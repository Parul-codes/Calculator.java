import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c;
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Multiplication");
        System.out.println("Press 3 for Substraction");
        System.out.println("Press 4 for Division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                c = a+b;
                System.out.println("Your sum is " + c);
                break;
            case 2: 
                c = a*b;
                System.out.println("Your product is " + c);
                break;
            case 3: 
                c = a-b;
                System.out.println("Your difference is " + c);
                break;
            case 4: 
                c = a/b;
                System.out.println("Your divison is " + c);
                break;
            default: 
                System.out.println("Invalid Key");
        }
    }
}