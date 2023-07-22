package Test;

import java.util.*;

public class test18 {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int arr[]=new int [a];

    for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
    Arrays.sort(arr);
    
     for(int i=0;i<a;i+=2)
     {
        if(arr[i]!=arr[i+1])
        {
        if(arr[i]!=arr[i+1])
        {
            System.out.print(arr[i]);
            break;
        }
        else
        {
            System.out.print(arr[i]);
        }
    }
        // {
        //     System.out.print(arr[i]);
        // }
        
        // for(int j=i+1;j<j;j++)
        // {
        // if(arr[i]!=arr[j])
        // {
        //     System.out.print(arr[i]);
        // }
        // break;
    }
     }

    
}

