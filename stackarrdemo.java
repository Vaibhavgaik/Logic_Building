package Datastructure;

public class stackarrdemo
{
    int top;
    int capacity;
    int []stack;
    stackarrdemo()
    {
        int top=-1;
        capacity=12;
        stack=new int[capacity];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==capacity-1;
    }
    public int  push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        return stack[++top]=data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return stack[--top];
    }
    public int peek()
    {
        return stack[top];

    }
    public void display()
    {
        for(int i: stack)
        {
            System.out.println(i);
        }
    }
    public static void main(String []args)
    {
        stackarrdemo st=new stackarrdemo();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
//        st.display();
        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println(st.pop());


    }

}

