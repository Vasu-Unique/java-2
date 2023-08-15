package TCS;

import java.util.Scanner;

public class ArrangeEvenOdd {
     public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }


}
}