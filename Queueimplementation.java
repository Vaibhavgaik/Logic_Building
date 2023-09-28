package Datastructure;
public class Queueimplementation
{
        int front;
        int capacity=5;
        int rear;
        int []object;
     Queueimplementation()
    {
        front=-1;
        rear=-1;
        object=new int[capacity];
    }
    boolean isEmpty()
    {
      return rear<=front;
    }
    int enqueue(int data)
    {
        return object[++rear]=data;
    }
    int dequeue(int i)
    {
        if(isEmpty())
        {
            System.out.println("The queue is empty");
        }
        if(rear>=front)
        {
            return object[--rear];
        }
        return(Integer) null;
    }

    int size()
    {
        return rear - front;

    }
    public static void main(String[]args)
    {
        Queueimplementation q=new Queueimplementation();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.isEmpty());
         System.out.println(q.capacity);
         System.out.println(q.dequeue(1));
        System.out.println(q.dequeue(2));

        System.out.println(q.dequeue(3));

    }
}

