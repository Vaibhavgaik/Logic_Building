package ARRAYS;

import java.util.Scanner;

public class removing_even_integer_fromarray
{
    public static void main(String[]args)
    {
        System.out.println("Enter the elements of the array");
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println("The even array elements are the "+a[i]+" ");
            }

        }
    }
}
