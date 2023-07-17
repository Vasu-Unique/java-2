/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
	
        while(t-->0)
        {
        int a=obj.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
		    arr[i]=obj.nextInt();
		}
		int count=0;
		for(int j=0;j<a;j++)
		{
		    if(arr[j]>=1000)
		    {
		        count++;
		    }
		}
		System.out.println(count);
		}
	}
}
