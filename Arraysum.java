public class Arraysum 

{ 
    public static void main(String [] args) 

    { 
        int []arr = {10, 20, 30, 40, 50}; 
         
        System.out.println("Array elements are : "); 
        
        // Traversing the array

        for (int i = 0; i < arr.length; i++)
 
        { 

            System.out.println(i + " element is " + arr[i]); 
        } 
        
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) 

        { 
            count++;
            sum = sum + arr[i];
        } 
        
  	System.out.println("Sum = " + sum);

	System.out.println("End of array elements"); 
    } 

}