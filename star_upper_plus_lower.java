//*
//**
//***
//****
//*****
//******
//*****
//****
//***
//**
//*
package PATTERN_PRINTING;

public class star_upper_plus_lower
{

        public static void main(String[]args)
        {
            for(int i=1;i<=6;i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            {
                for(int i=1;i<=5;i++)
                {
                    for(int j=5;j>=i;j--)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }
}
