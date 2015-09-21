/*
 * Solution to problem "Number Steps" on Sphere Online Judge  
 * http://www.spoj.com/problems/NSTEPS/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            if(x!=y && x-y != 2)
            {
                System.out.println("No Number");
            }
            else
            {
                if(x == y)
                {
                    if(x%2 == 0)
                        System.out.println(2*x);
                    else
                        System.out.println(2*x-1);
                }
                else
                {
                    if(x%2 == 0)
                        System.out.println(x+y);
                    else
                        System.out.println(x+y-1);
                }
            }
        }
    }
}
