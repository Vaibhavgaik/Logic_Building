package ARRAYS;
import java.util.Scanner;
public class adding_element_array
{
  public static void main(String[]args)
  {
     System.out.println("Enter element in the array");
     Scanner sc=new Scanner(System.in);
     int loc;
     int size=4;
     int  elemnt;
     int a[]=new int[size+1];
     for(int i=0;i<size;i++)
     {
         a[i]=sc.nextInt();
     }
     System.out.println("Enter the location of array");
     loc=sc.nextInt();
     System.out.println("Enter the the elemnt to be added in the array ");
     elemnt=sc.nextInt();

    for(int i=size;i>loc;i--)
    {
       a[i]=a[i-1];
    }
    a[loc]=elemnt;
    size++;
     for(int i=0;i<size;i++)
     {
         System.out.println("after adding the output will be"+" "+a[i]);
     }

   }
}
