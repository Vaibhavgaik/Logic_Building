package ARRAYS;

import java.util.Scanner;

public class avrg_of_array_element
{
    public static void main(String[]args)
    {
        int sum=0,rslt;

        int a[]=new int[7];
        System.out.println("Enter the elements whose avrg do u wanted to be");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            System.out.println("Enter the elements are"+" "+a[i]);
        }
        for(int i=0;i<7;i++)
        {
            sum=sum+a[i];
        }
           rslt = sum/7;
            {
            if (rslt > 0)
            {
                System.out.println("The avrg of the entered array elements are" + " " + rslt);
            } else
            {
                System.out.println(" THE AVRG FOR GIVEN NUMBER COULD NOT BE FOUND ");
            }
        }
    }
}
