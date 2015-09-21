/*
 * Solution to problem "What's Next" on Sphere Online Judge  
 * http://www.spoj.com/problems/ACPC10A/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int n3 = in.nextInt();
            if(n1 == 0 && n2 == 0 && n3 == 0)
                break;
            if(n2 - n1 == n3 - n2)
            {
                int next = n3 + n3 - n2;
                System.out.println("AP " + next);
            }
            else
            {
                double next = n3 * ((double)n3/n2);
                System.out.println("GP " + (int)next);
            }
        }
    }
}
