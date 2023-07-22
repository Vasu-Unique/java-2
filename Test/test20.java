package Test;

import java.util.Scanner;

public class test20 {
     public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int b= obj.nextInt();
    int sum=0;

    int arr[]=new int [a];

    for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
    
        for(int i=0;i<a;i++)
        {
            if(arr[a-1]<=arr[i])
            {
                System.out.println(arr[i]);
                break;
            }
            else
            {
            sum=sum+arr[i]; 
            if(arr[a-1]<=sum)
            {
                System.out.println(sum);
                break;
            }
        }
            
        }
}
}
