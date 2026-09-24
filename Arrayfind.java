public class Main

{

    public static void main(String[] args)

    {
        int[] arr = {34, 21, 5, 78, 4, 30};

        int even = 0;
        int odd = 0;

        System.out.println("Even numbers:");

        for (int i = 0; i < arr.length; i++)

        {

            if (arr[i] % 2 == 0)

            {
                System.out.println(arr[i]);
                even++;

            }
        }

        System.out.println("Total even numbers: " + even);

        System.out.println("Odd numbers:");

        for (int i = 0; i < arr.length; i++)

        {

            if (arr[i] % 2 != 0)

            {
                System.out.println(arr[i]);
                odd++;
            }
        }

        System.out.println("Total odd numbers: " + odd);
    }
}