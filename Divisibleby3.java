import java.util.*;
public class Divisibleby3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();

if(num % 3 == 0)
{
System.out.println(num+" is Divisible by 3");
}
else
{
System.out.println(num+" is not Divisible by 3");
}
sc.close();
}
}