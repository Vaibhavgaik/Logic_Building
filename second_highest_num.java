package ARRAYS;

public class second_highest_num
{
    public static void main(String[]args)
    {
        int arr1[]={2,34,78,1,21,5};
        int temp;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }

        }
        System.out.println(arr1[0]);


    }
}
