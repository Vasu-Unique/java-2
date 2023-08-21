package TCS;

import java.util.Scanner;

public class q34NegCount {
     public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        int count=0;
        
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]<0)
            {
           count++;
            }
        }
        System.out.println(count);
}
}