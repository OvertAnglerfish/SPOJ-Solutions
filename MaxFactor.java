/*
 * Solution to problem #3048 on Peking Online Judge  
 * http://poj.org/problem?id=3048
 * Written by Phillip Shih
 * September 18, 2015
 */

import java.util.*;

public class MaxFactor
{
    static int[] primes;
    public static void main(String[] args)
    {
        generatePrimes(20000);
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int maxprime = 1;
        int maxprimefactor = 1;
        for(int i=0; i < cases; i++)
        {
            int n = in.nextInt();
            int tmp = n;
            for(int j=0; primes[j] < tmp; j++)
            {
                if(tmp == primes[j])
                    break;
                if(tmp%primes[j] == 0)
                    tmp /= primes[j];
            }
            if(tmp > maxprimefactor)
            {
                maxprime = n;
                maxprimefactor = tmp;
            }
        }
        System.out.println(maxprime);
    }
    
    public static void generatePrimes(int n)
    {
        primes = new int[n/2];
        primes[0] = 2;
        primes[1] = 3;
        int primeptr = 2; //points to next empty slot of primes array
        for(int i= 6; i < n; i += 6)
        {
            int c = i-1;
            boolean prime = true;
            for(int j=0; j < primeptr; j++)
            {
                if(c%primes[j] == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
                primes[primeptr++] = c;
            
            c = i+1;
            prime = true;
            for(int j=0; j < primeptr; j++)
            {
                if(c%primes[j] == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
                primes[primeptr++] = c;
        }
    }
}
