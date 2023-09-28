package ARRAYS;
import java.util.Scanner;
public class copy_one_elmnt_into_another
{
    public static void main(String[]args)
    {
        int a[]=new int[7];
        int b[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Entere the elements in the array");
        for(int i=0;i<7;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            System.out.println("Entered the elements in a"+" "+a[i]);
        }
        System.out.println("Newly stored elements in the array are as follows ");
        for(int i=0;i<7;i++)
        {
              b[i] = a[i];
            System.out.println("Arrays are in b"+" "+b[i]);
        }
    }
}
