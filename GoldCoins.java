/*
 * Solution to problem "Bytelandian Gold Coins" on Sphere Online Judge  
 * http://www.spoj.com/problems/COINS/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;

public class Main
{
    private static long[] max = new long[1000000];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            long n = in.nextLong();
            System.out.println(maxMoney(n));
        }
    }

    public static long maxMoney(long n)
    {
        if (n < 1000000 && max[(int) n] != 0)
        {
            return max[(int) n];
        }
        if (n < 12)
        {
            return n;
        }

        long m = Math.max(n, maxMoney(n / 2) + maxMoney(n / 3)
                + maxMoney(n / 4));
        if (n < 1000000 && max[(int) n] == 0)
        {
            max[(int) n] = m;
        }
        return m;
    }
}
