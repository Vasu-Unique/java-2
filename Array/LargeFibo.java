import java.util.Arrays;
import java.util.Scanner;

public class LargeFibo {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int arr[]=new int [a];
         int i,j,r1=0,r2=1,r3;
        for(i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }


        for(i=0;i<a;i++)
        {
            for(j=0;j<99;j++)
            {
                r3=r1+r2;
                r1=r2;
                r2=r3;
                if(arr[i]==r2)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println(r3);
            }
        }


        
    }
}

// import java.util.*;
// public class LargeFibo 
// {
//     public static void main(String[] args) 
//     {
//         Scanner obj=new Scanner(System.in);
//         int n=obj.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=obj.nextInt();
//         }

//         int arr2[]=new int[10];
//         arr2[0]=0;arr2[1]=1;
//         for(int i=2;i<10;i++)
//         {
//             arr2[i]=arr2[i-1]+arr2[i-2];
//         }
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<arr2.length;j++)
//             {
//                 if(arr[i]==arr2[j])
//                 {
//                     System.out.print(arr[i]+" ");
//                     break;
//                 }
//             }
//         }
//     }
    
// }
