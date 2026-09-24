public class EvenNumbersPreset {
    public static void main(String[] args) {
        
        int[] numbers = {40, 54, 13, 44, 56, 39, 78, 84, 58, 69};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        System.out.println("\nEven Numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}