/*
 * Solution to problem "Play With Math" on Sphere Online Judge  
 * http://www.spoj.com/problems/ENIGMATH/
 * Written by Phillip Shih
 * September 21, 2015
 */

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int n=0;n<cases;n++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int gcd = gcd(a,b);
            int x = b/gcd;
            int y = a/gcd;
            System.out.println(x + " " + y);
        }
    }
    public static int gcd(int a,int b)
    {
        if(b > a){return gcd(b,a);}
        if(b == 0){return a;}
        return gcd(b, a%b);
    }
}

