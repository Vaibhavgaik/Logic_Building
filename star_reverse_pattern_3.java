package PATTERN_PRINTING;

public class star_reverse_pattern_3
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1;j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k<=5; k++)
            {
                System.out.print("x");
            }
            System.out.println(" ");
        }
    }
}
//            xxxxx
//            xxxx
//            xxx
//            xx
//            x