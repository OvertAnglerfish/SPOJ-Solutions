/*
 * Solution to problem "To and Fro" on Sphere Online Judge  
 * http://www.spoj.com/problems/TOANDFRO/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
 import java.util.*;

public class BackAndForth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            int col = in.nextInt();
            if(col == 0)
                break;
            String msg = in.next();
            int ht = msg.length() / col;
            char[][] grid = new char[ht][col];
            int n = 0;
            int cmod = 1;
            int c = 0;
            int r = 0;
            while(n < msg.length())
            {
                grid[r][c] = msg.charAt(n);
                n++;
                c += cmod;
                if(c == col || c < 0)
                {
                    c -= cmod;
                    cmod *= -1;
                    r++;
                }
            }
            String out = "";
            for(int i = 0; i < col; i++)
            {
                for(int j = 0; j < ht; j++)
                {
                    out += grid[j][i];
                }
            }
            System.out.println(out);
        }
    }
}
