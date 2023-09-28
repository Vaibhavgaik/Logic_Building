package Strings;
public class pallindrome
{
    public static void main(String[]args)
    {
        String a="mad";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println("The reversed string will be"+b);
        if(b.equals(a))
        {
                System.out.println("Given string is a pallindrome ");
        }
        else
        {
            System.out.println("Given string is not a pallindrome ");
        }
    }
}
