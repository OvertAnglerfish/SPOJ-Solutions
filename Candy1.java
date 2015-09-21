/*
 * Solution to problem "Candy I" on Sphere Online Judge  
 * http://www.spoj.com/problems/CANDY/
 * Written by Phillip Shih
 * September 21, 2015
 */

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            int packets = in.nextInt();
            if(packets == -1)
                break;
            int[] contents = new int[packets];
            int sum = 0;
            for (int i = 0; i < contents.length; i++)
            {
                contents[i] = in.nextInt();
                sum += contents[i];
            }
            if (sum % packets == 0)
            {
                int moves = 0;
                int packSize = sum / packets;
                for (int i : contents)
                {
                    if (i < packSize)
                    {
                        moves += packSize - i;
                    }
                }
                System.out.println(moves);
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}
