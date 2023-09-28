package ARRAYS;
//By using arrays clas
import java.util.Scanner;
import java.util.Arrays;
public class array_sort_method
{
    public static void main(String[]args)
    {
        System.out.println("Enter the elemenyt in the array ");
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }

}
