package Strings;

public class removing_spl_char
{
    public static void main(String[]args)
    {
        String str = "@#%abc*def";
        String str2 = str.replaceAll("[^A-Za-z0-9]", "");

        System.out.println(str2);
    }
}
