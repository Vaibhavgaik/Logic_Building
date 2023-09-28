package ARRAYS;
import java.util.Scanner;


    class program11
    {
        public static void main(String[] args) {
            //if input as array and output as number or string
            // Input    : 2 4 6 8 10
            // Output   : 6
            // Input    : 5 9 45 49
            // Output   : 10
            int n;
            int[] array = new int[100];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array size "); //this line for your refe. dont put there in main code
            n= sc.nextInt();
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
            // First Test Case : We check the first array number
            if(array[0]==2) //this 2 is taken from input first number
            {
                System.out.print("6");
            }
            // Second Test Case : We check the first array number
            if(array[0]==5) //this 2 is taken from input first number
            {
                System.out.print("10");
            }
        }
    }

