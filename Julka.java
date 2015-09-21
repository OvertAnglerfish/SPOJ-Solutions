/*
 * Solution to problem "Julka" on Sphere Online Judge  
 * http://www.spoj.com/problems/JULKA/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        for(int n = 0; n < 10;n++)
        {
            BigInteger total = new BigInteger(in.nextLine());
            BigInteger diff = new BigInteger(in.nextLine());
            BigInteger natalia = total.subtract(diff).divide(BigInteger.valueOf(2));
            BigInteger klaudia = natalia.add(diff);
            System.out.println(klaudia.toString());
            System.out.println(natalia.toString());
        }

    }

}
