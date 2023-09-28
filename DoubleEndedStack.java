package Datastructure;
public class DoubleEndedStack
{
    int top;
    int bottom;
    int capacity;
    int []stack;
    DoubleEndedStack()
    {
        top=1;
        bottom=-1;
        stack=new int[capacity];
    }
    public boolean isEmpty()
    {
        if(top==0&&bottom==0)
        {
                System.out.println("Hello dear given stack is empty");
        }
        return false;
    }
    public boolean isFull()
    {
        if(bottom==0&&top==stack.length-1)
        {
            System.out.println("Hello dear yor stack is full");
        }
        return false;
    }
    public void pushfromtop()
    {
        if(isFull())
        {
              System.out.println("Stack is full");
        }
        else if (isEmpty())
        {
            //stack[++];
        }
    }

}
