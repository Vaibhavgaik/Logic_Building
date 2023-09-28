package ARRAYS;

public class parenthesis_matchng
{
    public static void main(String[]args)
    {
        char a[]=new char[6];
         a[0]='[';
         a[1]=']';
        a[2]='(';
        a[3]=')';
        a[4]='{';
        a[5]=')';
        if(a[0]==a[1]&&a[2]==a[3]&&a[4]==a[5])
        {
            System.out.print("Entered parenthesis are balnced ");
        }
        else
        {
            System.out.println("Ooppsss!!!! Buddy the parenthesis are entered are not balanced ");
        }
    }
}
