package PATTERN_PRINTING;

public class hexagonal
{
    public static void main(String[]args)
    {
        {
            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int l = 1; l < 5; l++) {
                    System.out.print("*");
                }
                for (int m = 2; m <= i; m++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
        {
            for(int i=1;i<=5;i++)
            {
                for (int j=1;j<=i;j++)
                {
                  System.out.print(" ");
                }
                for (int k=5;k>=i;k--)
                {
                    System.out.print("*");
                }
                for(int l=1;l<=5;l++ )
                {
                    System.out.print("*");
                }
                for(int m=4;m>=i;m--)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
    }
}
