/*
   Input:  3                   Input:  5
   output:                     Output: 
            ----c----                  --------e--------  
            --c-b-c--                  ----e-d-c-d-e----
            c-b-a-b-c                  e-d-c-b-a-b-c-d-e
            --c-b-c--                  --e-d-c-b-c-d-e--
            ----c----                  --e-d-c-b-c-d-e--
                                       ------e-d-e------
                                       --------e--------
 */

import java.util.*;
public class RangoliPattern1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=3;
        int a=97;
        int b=a+n-1; //
       

        for(int i=1;i<n;i++)
        {
            int c=b;
            for(int j=i;j<n;j++) //decrease
            {
                System.out.print("--");
            }
            for(int j=1;j<=i;j++) //increase
            {
                System.out.print((char)c);
                if(j!=i)
                {
                    System.out.print("-");
                }
                c--;
            }
            int d=b+2-i;
            for(int j=1;j<i;j++) //increase
            {
                System.out.print("-"+(char)d);
                d++;
            }
            
            for(int j=i;j<n;j++) //in
            {
                System.out.print("--");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            int c=b;
            for(int j=1;j<i;j++) //decrease
            {
                System.out.print("--");
            }
            for(int j=i;j<=n;j++) //increase
            {
                System.out.print((char)c);
                c--;
                if(j!=n){
                    System.out.print("-");
                }
            }
            int d=a+i; 
            for(int j=i;j<n;j++) //increase
            {
                System.out.print("-"+(char)d);
                d++;
            }
            
            for(int j=1;j<i;j++) //in
            {
                System.out.print("--");
            }
            System.out.println();
        }
    }
}