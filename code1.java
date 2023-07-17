/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class code1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
        
		
		while(t-->0)
           {
            int count=0;
            int a=obj.nextInt();
            int b=obj.nextInt();
            for(int i=a;i<b;i++)
            {
                count++;
            }
               System.out.println(count);
           }
       
        
       
	}
}
