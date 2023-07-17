package Serv;
import java.util.*;
public class Frequency
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            a[arr[i]]++ ;
        }
        for(int i=0; i<n; i++) 
        {
            if(arr[i]>1)
            {
              System.out.println(i+arr[i]);
            }
        }

    }
}

