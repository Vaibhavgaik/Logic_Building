package ARRAYS;

import java.util.Scanner;

public class Lenghth_of_array
{
    public static void main(String[]args)
    {
        int a[]=new int[6];
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the element");
     for(int i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" ");
        }
     System.out.print("Array lenght will be"+a.length);
    }
}
