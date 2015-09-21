/*
 * Solution to problem "Adding Reversed Numbers" on Sphere Online Judge  
 * http://www.spoj.com/problems/ADDREV/
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
         for(int i = 0; i < n; i++)
         {
              int a = flip(in.nextInt());
              int b = flip(in.nextInt());
              System.out.println(flip(a+b));
         }
     }
     
     public static int flip(int n)
     {
          String str = Integer.toString(n);
          String holder = "";
          for(int i = str.length()-1; i >= 0; i--)
          {
               holder += str.charAt(i);
          }
          return Integer.parseInt(holder);
      }
}


