package Strings;

public class remove_spaces
{
    public static void main(String[]args)
    {
        String str="va  i b h av";
        String str2=str.replaceAll("\\s","");
        System.out.println(str2);
    }
}
