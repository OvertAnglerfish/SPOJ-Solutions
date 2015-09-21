/*
 * Solution to problem "Factorial" on Sphere Online Judge  
 * http://www.spoj.com/problems/FCTRL/
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
        for (int i = 0; i < n; i++)
        {
            int num = in.nextInt();
            int twos = 0;
            int c = 2;
            while(c <= num)
            {
                twos += num/c;
                c *= 2;
            }
            int fives = 0;
            c = 5;
            while(c <= num)
            {
                fives += num/c;
                c *= 5;
            }
            System.out.println(Math.min(fives,twos));
        }
    }
}
