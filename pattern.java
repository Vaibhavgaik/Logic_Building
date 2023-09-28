package PATTERN_PRINTING;
//
//public class pattern
//{
//    public static void main(String[]args)
//    {
//        for(int j=1;j<=5;j++)
//        {
//            for (int i = 1; i<=j; i++)
//            {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//    }
//}
//        *
//        **
//        ***
//        ****
//        *****
//**************************************************************************************************************
//public class pattern
//{
// public static void main (String[]args)
// {
//     for(int i=1;i<=10;i++)
//     {
//         for(int j=10;j>=i;j--)
//         {
//             System.out.print("*");
//         }
//         System.out.println(" ");
//     }
// }
//}
//        **********
//        *********
//        ********
//        *******
//        ******
//        *****
//        ****
//        ***
//        **
//        *
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class pattern
{
    public static void main(String[]args)
    {
        for(int i=1;i<=4;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
        System.out.println(" ");
        }
        {
          for(int i=1;i<=3;i++)
          {
              for(int j=3;j>=i;j--)
              {
                  System.out.print("*");
              }
              System.out.println(" ");
          }
        }
    }
}