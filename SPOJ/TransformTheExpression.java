/*
 * Solution to problem "Transform the Expression" on Sphere Online Judge  
 * http://www.spoj.com/problems/ONP/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int n = 0; n < cases;n++)
        {
            String exp = in.next();
            StringBuilder output = new StringBuilder();
            char[] op = new char[400];
            int end = 0;
            for(int i=0; i<exp.length();i++)
            {
                if(exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z')
                {
                    output.append(exp.charAt(i));
                }
                else if(exp.charAt(i) == '+' ||exp.charAt(i) == '-' ||exp.charAt(i) == '*' ||exp.charAt(i) == '/' ||exp.charAt(i) == '^')
                {
                    op[end++] = exp.charAt(i);
                }
                else if(exp.charAt(i) == ')')
                {
                    output.append(op[--end]);
                    op[end] = 0;
                }
            }
            System.out.println(output);
        }
    }

}
