/*
 * Solution to problem "Will it ever stop" on Sphere Online Judge  
 * http://www.spoj.com/problems/WILLITST/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long check = 1;
        while (num > check)
        {
            check *= 2;
        }

        if (num == check)
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }
}
