/*
 * Solution to problem "Hangover" on Sphere Online Judge  
 * http://www.spoj.com/problems/HANGOVER/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        while(n != 0)
        {
            double i;
            for(i=1; n > 0; i++)
            {
                n -= 1/(i+1);
            }
            i-=1;
            int j = (int)i;
            System.out.println(j+ " card(s)");
            n = in.nextDouble();
        }
    }
}
