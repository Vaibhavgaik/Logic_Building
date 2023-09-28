package ARRAYS;

import java.util.Scanner;

public class search_element
{
    public static void main(String[]args)
    {
        System.out.print("Enter the elements");
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        int n,count=0;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Entered elements are"+"  "+a[i]);
        }
        System.out.println("Enter the num which u wanted tobed searched in the array ");
        n=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print("Entered num is available in the array ");
        }
        else
        {
            System.out.print("Entered num is not available in the array ");
        }

    }
}
