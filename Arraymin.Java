public class Arraymin

{

    public static void main(String [] args)

    {
        int arr[] = {10, 20, 34, 4, 5};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++)

        {

            if (min > arr[i])
                min = arr[i];

        }

        System.out.print("Smallest value of array is : " + min);

    }

}