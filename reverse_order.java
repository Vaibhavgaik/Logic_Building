package ARRAYS;

import java.util.Scanner;

public class reverse_order
{
    public static void main(String[]args)
    {
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("THE OUTPUT FOR THE CODE IS");
        for(int i=0;i<a.length;i++)
        {
            System.out.print("The array elements are"+a[i]+" ");
        }
        for(int i=a.length-1;i>0;i--)
        {
           System.out.println("The array elements in the array are "+a[i]+" ");
        }
    }
}
