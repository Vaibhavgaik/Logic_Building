package ARRAYS;

import java.util.Scanner;
public class delete_array_element_by_pos
{
    public static void main(String[]args)
    {


       Scanner sc=new Scanner(System.in);
        int size=4;
        System.out.println("Enter the element in the array");
       size=sc.nextInt();

       int []arr=new int[size-1];
       for(int i=0;i<size;i++)
       {
          arr[i]=sc.nextInt();
       }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }



    }
}