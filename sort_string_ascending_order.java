package Strings;
public class sort_string_ascending_order
{
    public static void main(String[]args)
    {
        String sc="rock";
        char  temp;
        char []ch=sc.toCharArray();
        for (int i=0;i<sc.length();i++)
        {
           for(int j=i+1;j<sc.length();j++)
           {
               if(ch[i]>ch[j])
               {
                   temp=ch[i];
                   ch[i]=ch[j];
                   ch[j]=temp;
               }
           }
        }
        System.out.println(new String(ch));
    }
}
