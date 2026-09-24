public class Arraymax

{

    public static void main(String [] args)

    {
        int arr[] = {10, 20, 34, 4, 5};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++)

        {

            if (max < arr[i])
                max = arr[i];

        }

        System.out.print("Largest value of array is : " + max);

    }

}