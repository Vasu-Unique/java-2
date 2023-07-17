package Test;

import java.io.*;
import java.util.*;
 
class test8
{
    public static int stopping_station(int p, int n)
    {
        int num = 1, dem = 1, s = p;
        while (p != 1)
        {
            dem *= p;
            p--;
        }
 
        int t = n - s + 1;
        while (t != (n - 2 * s + 1))
        {
            num *= t;
            t--;
        }
 
        if ((n - s + 1) >= s)
            System.out.print(num / dem);
 
        return 0;
    }
 
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);    
        int s=obj.nextInt();
        int n=obj.nextInt();
        stopping_station(n,s);
    }
}