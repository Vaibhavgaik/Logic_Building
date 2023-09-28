package Strings;
import java.util.*;
public class parenthesis_matching {
    public static void main(String[] args) {
        String sc = "([])}";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sc.length(); i++)
        {
            char ch = sc.charAt(i);
            if (st.empty())
            {
                st.push(ch);
            }
            else if (ch=='{'||ch=='('||ch=='[')
            {
                   st.push(ch);
            }
            else if (ch=='{'&&st.peek()=='}')
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
        if (st.empty())
        {
            System.out.println("Given parenthesis are matching");
        }
        else
        {
            System.out.println("Given parenthesis are NOT matching");
        }
    }
}