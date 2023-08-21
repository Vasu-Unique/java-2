package TCS;

import java.util.*;

public class q37HighAdd {
     public static void main(String args[])
    {
    Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);

            System.out.println(arr[a-1]+arr[a-2]);


      
         
        
    }
}
