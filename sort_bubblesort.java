package Datastructure;
public class sort_bubblesort
{
    public static void main(String[]args)
    {
                   int temp=0;
                   int arr[]={11,10,4,78,32,1};
                   for(int i=0;i<arr.length;i++)
                   {
                       for(int j=0;j< arr.length-1-i;j++)
                       {
                           if(arr[j]>arr[j+1])
                           {
                                    temp=arr[j];
                                    arr[j]=arr[j+1];
                                    arr[j+1]=temp;
                           }
                       }
                   }
                   for(int i=0;i< arr.length;i++)
                   {
                       System.out.println(arr[i]+" ");
                   }

    }
}
