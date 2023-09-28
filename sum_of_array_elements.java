package ARRAYS;

import java.util.Scanner;

public class sum_of_array_elements
{
    public static void main(String[]args)
    {
        int sum=0;
        System.out.print("Enter the array elements");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("The entered elements are"+" "+a[i]);
        }
        for(int i=0;i<5;i++)
        {
            sum=a[i]+sum;

        }
        System.out.println("THE SUM OF THE ARRAYS ARE AS FOLLOWS=="+"  "+sum);
    }
}
