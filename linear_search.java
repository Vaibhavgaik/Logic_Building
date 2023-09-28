package Datastructure;

public class linear_search {
    public static void main(String[] args)
    {
        int item=300;
        int temp=0;

        int arr[] = {100, 200, 300, 400, 500};
        for (int i = 0; i <arr.length;i++)
        {
            if(arr[i]==item)
            {
                System.out.println("The position of an element of the array"+arr[i]+"is a"+i);
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("The element is not present in the array");
        }

    }
}