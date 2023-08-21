package TCS;

import java.util.*;

public class q31SortPosition {
    public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr[]=new int[a];
        
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
         
        System.out.println(arr[b-1]);
    }
}
