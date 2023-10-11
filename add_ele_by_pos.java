//Adding Element by position
package ARRAYS;
import java.util.Scanner;
public class add_ele_by_pos
{
    public static void main(String[]args)
    {
        int i;
        int pos;
        int ele;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element that you wanted to be printed");
        int size=4;
        int arr[]=new int[size+1];
        for( i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the posion that the element that u wanted to be printed to be");
        pos=sc.nextInt();
        System.out.println("Enter the element ");
        ele=sc.nextInt();
        for(i=size;i>pos;i--)
        {
           arr[i]=arr[i-1];
        }
        arr[i]=ele;
        size++;

        for( i=0;i<size;i++)
        {
           System.out.println(arr[i]);
        }

    }
}
