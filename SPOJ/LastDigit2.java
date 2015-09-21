/*
 * Solution to problem "The Last Digit Re-visited" on Sphere Online Judge  
 * http://www.spoj.com/problems/LASTDIG2/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();
        for (int n = 0; n < cases; n++)
        {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            BigInteger c = a.modPow(b,new BigInteger("10"));
            System.out.println(c.toString());
        }
    }
}
