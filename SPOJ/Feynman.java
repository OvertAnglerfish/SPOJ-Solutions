/*
 * Solution to problem "Feynman" on Sphere Online Judge  
 * http://www.spoj.com/problems/SAMER08F/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int n = in.nextInt();
            if(n == 0)
                break;
            int result = n * (n+1) * (2*n+1)/6;
            System.out.println(result);
                
        }
    } 
}
