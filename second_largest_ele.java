package ARRAYS;
public class second_largest_ele
{
  public static void main(String[]args)
  {
      int i;
      int j;
      int max = 0;
      int arr[]={10,20,8,4,50};
      System.out.println("The elements in the array");
     for( i=0;i<5;i++)
     {
         System.out.println(arr[i]);
     }
     System.out.println("The highest element in the array");
      for( i=0;i<arr.length;i++)
      {
          max=arr[0];

              if(arr[i]>max)
              {
                  max=arr[i];
              }


      }
      System.out.println(max-arr[i]);
  }
}
