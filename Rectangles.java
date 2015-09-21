/*
 * Solution to problem "Rectangles" on Sphere Online Judge  
 * http://www.spoj.com/problems/AE00/
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
        int ct = n;
        int end = (int)Math.sqrt(n);
        for(int width = 2; width <= end; width++)
        {
            ct += n/width + 1 - width;
        }
        System.out.println(ct);
    }
}
