package ARRAYS;

import java.util.Scanner;

public class matrix_element
{
    public static void main(String []args)
    {
        System.out.println("Enter elements in the array");
        Scanner sc=new Scanner(System.in);
       int [][]arr=new int[2][2];
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               arr[i][j]=sc.nextInt();

           }
       }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(arr[i][j]+"  ");
            }
            System.out.println("\n");
        }

    }
}

