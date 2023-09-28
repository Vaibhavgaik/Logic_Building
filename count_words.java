package Strings;

public class count_words
{
    public static void main(String[]args)
    {
       String sc="Welcome to PUNE";
       int count=0;
       for(int i=0;i<sc.length();i++)
       {
           if(sc.charAt(i)!=' ')
           {
               count++;
           }
       }
       System.out.println(count);
    }
}
