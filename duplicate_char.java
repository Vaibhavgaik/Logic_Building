package Strings;
public class duplicate_char
{
    public static void main(String[]args)
    {
        String sc="aabcdd";
        int Count=0;
        char [] abc=sc.toCharArray();
        for(int i=0;i<sc.length();i++)
        {
            for(int j=i+1;j<sc.length();j++)
            {
                if(abc[i]==abc[j])
                {
                    System.out.println("Duplicate element in the array"+" "+abc[i]);
                    Count++;
                }
            }
          }
        System.out.println("Count"+":"+Count);
    }
}
