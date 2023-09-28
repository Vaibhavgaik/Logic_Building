package Strings;

import java.util.Stack;

public class pm2
{
    public static void main(String[]args)
    {
        String sc="{([])}";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<sc.length();i++)
        {
           char ch=sc.charAt(i);
           if(st.empty())
           {
               st.push(ch);
           } else if (ch=='{'||ch=='('||ch=='[')
           {
                  st.push(ch);
           } else if (ch=='{'&&st.peek()=='}')
           {
               st.pop();
           }
           else if (ch=='('&&st.peek()==')')
           {
               st.pop();
           }
           else if (ch=='['&&st.peek()==']')
           {
               st.pop();
           }
        }
        if(st.empty())
        {
            System.out.println("The given parenthesis are balanced");
        }
        else
        {
            System.out.println("The given parenthesis are not balanced");
        }

    }
}
