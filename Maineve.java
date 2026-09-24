public class Main 

{	

    public static void main(String[] args) 
	
	{

        int[] arr = {34, 21, 5, 78, 4, 30};

        System.out.println("Even numbers:");

        for (int i = 0; i < arr.length; i++) 

	{

            if (arr[i] % 2 == 0) 

	{

	 System.out.println(arr[i]);

        }

        }

        System.out.println("Odd numbers:");

        for (int i = 0; i < arr.length; i++) 

	{
            if (arr[i] % 2 != 0) 

	{
                System.out.println(arr[i]);          

	}

        }
    }

}
