/* Given a sorted array 'a[]', insert an element 'value' such that the array remains sorted.
Input:
   Array = 1 2 4 5
   Value to insert = 3
Output:
      1 2 3 4 5 8 */

import java.util.*;

public class shlok2 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        int a=obj.nextInt(); //4
        int arr[]=new int[a];  // 1 2 4 5
        int b=obj.nextInt(); //3
        int temp=0;

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

    for(int i=0;i<a;i++) 
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }  
        }

        for(int i=0;i<a;i++) 
        {
                if(arr[i]>b)
                {
                temp=arr[i];
                arr[i]=b;
                arr[i+1]=temp;
                }
                a++;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
