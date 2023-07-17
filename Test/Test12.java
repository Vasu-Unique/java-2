package Test;

import java.util.*;
class Test12
{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i]=obj.nextInt();
        }
        int digit=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr[0])
            {
                digit++;
            }
        }
        System.out.println(n-digit);
        }
}
