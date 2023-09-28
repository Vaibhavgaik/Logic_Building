package ARRAYS;

public class count_of_num
{
    public static void main(String[]args)
            {
                int Count=0;
                int []arr={0,1,1,3,4,5,1};
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=i+1;j<arr.length;j++)
                    {
                         if(arr[i]==arr[j])
                         {
                             System.out.println(arr[i]);
                             Count++;
                         }
                    }
                }
                System.out.println(Count);
            }
}
