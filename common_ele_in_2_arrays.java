package ARRAYS;

import java.util.Scanner;

public class common_ele_in_2_arrays
{
    public static void main(String[]args)
    {
        int count=0;
        System.out.println("Enter the element in the array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int arr2[]=new int[5];
        System.out.println("Enter elements in  the first array");
        for(int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter elements in  the Second array");
        for(int i=0;i<5;i++)
        {
            arr2[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
           System.out.println( arr[i]);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println( arr[i]);
        }
        for(int i=0;i<5;i++)
        {
          for(int j=1;j<5;j++)
          {
              if(arr[i]==arr2[j])
              {
                  System.out.println("The common elements in the array"+arr[i]);
                  count++;
              }
          }

        }
        System.out.println("The common elements in the array"+count);

    }
}
