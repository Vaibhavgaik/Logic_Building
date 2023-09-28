package ARRAYS;
import java.util.Scanner;
public class biggest_element_in_array
{
    public  static void main(String[]args) {
        int max=0;
        System.out.println("Enter the element in the array ");
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for (int i = 0; i < 4; i++)
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 0; i < 4; i++)
        {
            if (max > a[i])
                {
                    max=a[i];
                }
            System.out.println(max);
        }
    }
}
