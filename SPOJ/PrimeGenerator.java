/*
 * Solution to problem "Prime Generator" on Sphere Online Judge  
 * http://www.spoj.com/problems/PRIME1/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j = 0; j < n; j++)
        {
            int low = in.nextInt();
            int high = in.nextInt();
            for(int i = low; i <= high; i++)
            {
                if(isPrime(i))
                    System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if (n == 1)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0)
            return false;
        if (n < 9)
            return true;
        if (n % 3 == 0)
            return false;
        int r = (int) Math.floor(Math.sqrt(n));
        for (int i = 5; i <= r; i += 6)
        {
            if(n%i == 0)
                return false;
            if(n%(i+2) == 0)
                return false;
        }
        return true;
    }
}
