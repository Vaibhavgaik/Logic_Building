package Datastructure;

public class binary_search
{
    public static void main(String[]args) {
        int arr[] = {100, 200, 300, 400, 500};
        int lowi = 0;
        int lari = arr.length - 1;
        int midi = (lowi + lari) / 2;
        int check = 100;
        while (lowi < lari)
        {
            if (arr[midi] == check) {
                System.out.println("The element" + arr[midi] + " is present" + midi + "");
                break;
            } else if (arr[midi] < check) {
                lowi = midi + 1;
            } else {
                lari = midi - 1;
            }
            midi = (lowi + lari) / 2;
        }
            if (lowi > lari)
            {
                System.out.println("The element cant found ");
            }
        }
    }

