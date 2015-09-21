/*
 * Solution to problem "Candy III" on Sphere Online Judge  
 * http://www.spoj.com/problems/CANDY3/
 * Written by Phillip Shih
 * September 21, 2015
 */

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i=0; i<cases; i++)
		{
			long kids = in.nextLong();
			long candies = 0;
			for(int j=0; j<kids; j++)
			{
				candies += in.nextLong();
				candies %= kids;
			}
			System.out.println(candies == 0? "YES" : "NO");
		}
		in.close();
	}
}
