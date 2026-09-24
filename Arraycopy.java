public class ArrayCopyExample {

    public static void main(String[] args) {
        
        int[] sourceArray = {40, 54, 13, 44, 56, 39, 78, 84, 58, 69};
        
        
        int[] destinationArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {

            destinationArray[i] = sourceArray[i];
        }

        
        System.out.println("Source Array:");
        for (int num : sourceArray) {
            System.out.print(num + " ");
        }

        
        System.out.println("\n\nCopied (Destination) Array:");

        for (int num : destinationArray) {

            System.out.print(num + " ");
        }

        System.out.println();
    }
}