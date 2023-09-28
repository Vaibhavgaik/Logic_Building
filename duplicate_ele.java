package ARRAYS;
import java.util.Scanner;
public class duplicate_ele
{
    public static void main(String[] args)
    {
        System.out.println("Enter the elements in the array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr [i]= sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
          System.out.println(arr[i]);
        }
          for(int i=0;i<5;i++)
          {
             for(int j=i+1;j<5;j++)
             {
                 if( arr[i]==arr[j])
                 {
                     System.out.println("Duplicate elements will be"+arr[i]);
                 }
             }
          }
    }
}