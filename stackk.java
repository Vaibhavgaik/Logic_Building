package Datastructure;

import java.util.Stack;

public class stackk
{
    public static void main(String[]args)
    {
        Stack<String> games=new Stack<String>();
        games.add("pubg");
        games.add("cricket");
        games.add("Hollyball");
        System.out.println(games);
//            System.out.println(games.pop());
//        System.out.println(games.pop());
//
//        System.out.println(games.pop());
           System.out.println(games.peek());
        //System.out.println(games);
        System.out.println(games.get(1));

    }
}
