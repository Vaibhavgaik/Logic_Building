package Datastructure;

public class sort_selectionsort
{
    public static void main(String[]args)
    {
        int temp=0;
         int arr[]={23,34,21,8,4,76,56};
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }
    }
}
