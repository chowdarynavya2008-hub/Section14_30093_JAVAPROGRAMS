import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5.");
        } 
        else if (n % 3 == 0) {
            System.out.println("The number is divisible by 3 only.");
        } 
        else if (n % 5 == 0) {
            System.out.println("The number is divisible by 5 only.");
        } 
        else {
            System.out.println("The number is divisible by neither 3 nor 5.");
        }

        sc.close();
    }
}