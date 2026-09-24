import java.util.Scanner;

public class SumAndAverageCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Please enter 5 integers:");
        
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("\n--- Results ---");
        System.out.println("Sum of the given elements: " + sum);
        System.out.println("Average of the given elements: " + average);

        sc.close();
    }
}