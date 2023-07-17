package Hollow_pattern;

import javax.lang.model.util.ElementScanner14;

public class HollowIncreasingTriangle {
    public static void main (String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=1;j<=n;j++)
            {
                if (i==n||j==1||j==i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
        }
    }
}
