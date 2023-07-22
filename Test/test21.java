package Test;

import java.util.Scanner;
public class test21 {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int sum=0;

    int arr[]=new int [a];

    for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i+1]!=arr[i]+1)
            {
                System.out.println(arr[i]+1);
                break;
            }
        }
        }
}

