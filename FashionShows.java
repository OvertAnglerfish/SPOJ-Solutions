/*
 * Solution to problem "Fashion Shows" on Sphere Online Judge  
 * http://www.spoj.com/problems/FASHION/
 * Written by Phillip Shih
 * September 21, 2015
 */
 
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int n=0;n<cases;n++)
        {
            int size = in.nextInt();
            in.nextLine(); //discard a new line
            
            String[] menStr = in.nextLine().split(" ");
            String[] womenStr = in.nextLine().split(" ");
            int[] men = new int[size];
            int[] women = new int[size];
            for(int i=0; i<size; i++)
            {
                men[i] = Integer.parseInt(menStr[i]);
                women[i] = Integer.parseInt(womenStr[i]);
            }
            men = sort(men);
            women = sort(women);
            
            int sum = 0;
            for(int i=0;i<size;i++)
            {
                sum += men[i] * women[i];
            }
            System.out.println(sum);
        }
    } 
    public static int[] sort(int[] b)
    {
        int n[] = b;
        for(int i=0; i<n.length;i++)
        {
            boolean swap = false;
            for(int j=0;j<n.length-i-1;j++)
            {
                if(n[j]>n[j+1]){
                    int t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                    swap = true;
                }
            }
            if(!swap){break;}
        }
        return n;
    }
}
