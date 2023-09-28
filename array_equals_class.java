package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class array_equals_class
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in the first array");
        int a[]=new int[5];
        int b[]=new int[5];
        for(int i=1;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements in the Second array");
        for(int i=1;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
      boolean c=Arrays.equals(a,b);
        System.out.println("ARE THE TWO ARRAUYS ARE EQUAL"+" "+c);

    }
}
