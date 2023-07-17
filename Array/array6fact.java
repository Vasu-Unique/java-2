// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner obj = new Scanner(System.in);
             int t=obj.nextInt();
             int sum=1;
             while(t-->0)
             {
                 int a=obj.nextInt();
                 int arr[]=new int[a];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=obj.nextInt();
                }

                for(int i=1;i<arr.length;i++)
                {
                    sum=sum+i;
                }
                System.out.println(sum);
             }
            }
	    
	}





