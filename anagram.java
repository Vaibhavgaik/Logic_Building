package Strings;
//import java.sql.Array;
import java.util.Arrays;
public class anagram
{
    public static void main(String[] args) {
        String sc1 = "earth";
        String sc2 = "heart";
        char[] arr=sc1.toCharArray();
        char[]arr2=sc2.toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr);

        if(Arrays.equals(arr,arr2))
        {
            System.out.println("Given String is anagram");
        }
        else
        {
            System.out.println("Given string is not an anagram");
        }

    }
}