package Strings;
public class reverse_array_part2
{
    public static void main(String[]args)
    {
        String s="Vaibhav";
        char [] charr=s.toCharArray();
        for (int i=charr.length-1;i>=0;i--)
        {
            System.out.print(charr[i]);
        }
    }
}
