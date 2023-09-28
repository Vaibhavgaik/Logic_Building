package Strings;

public class reverse_String
{
    public static void main(String[]args)
    {
        String v = "";
        String sc = "Vaibhav";
        for(int i=sc.length()-1;i>=0;i--)
        {
            v=v+sc.charAt(i);
        }
        System.out.println(v);
    }
}
