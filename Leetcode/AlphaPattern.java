package Leetcode;

import java.util.Scanner;
import java.util.*;

/**
 * AlphaPattern
 */
// public class AlphaPattern {
//     public static void main(String[] args) {
//     int n=5;
//     char ch1='a';
//     char ch2='Z';
//             for(int i=1;i<=n;i++)
//             {
//                 for(int j=1;j<=i;j++)
//                 {
//                     if((i%2==0 && j%2==0) ||(i%2!=0 && j%2!=0))
//                     {
//                         System.out.print(ch1);
//                         ch1++;
//                     } 
//                     else
//                     {
//                         System.out.print(ch2);
//                         ch2--;
//                     }
//                 }
//                 System.out.println();
//             }
// }
// }


public class AlphaPattern {
    public static void main(String args[])
    {
        int n=5;
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=2;

        for (int i = 2; i <n; i++) {
            arr[i] = arr[i-2]+3; 
        }

        char ch1='a';
        char ch2='Z';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=arr[i-1];j++)
            {
                if((i%2==0 && j%2==0) ||(i%2!=0 && j%2!=0))
                {
                    System.out.print(ch1);
                    ch1++;
                } 
                else
                {
                    System.out.print(ch2);
                    ch2--;
                }
            }
            System.out.println();
        }
        
    }
}



// public class AlphaPattern {

//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         int n=5;
//         ArrayList<Integer> al=new ArrayList<Integer>();
//         char ch1='a';
//         char ch2='Z';

//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if(i%3==0)
//                 {
//                     n++;
//                     break;
//                 }
//                 if((i%2==0 && j%2==0)||(i%2!=0 && i%2!=0))
//                 {
//                     System.out.print(ch1);
//                     ch1++;
//                 }
//                 else
//                 {
//                     System.out.print(ch2);
//                     ch2--;
//                 }
//             }
//             System.out.println();
//         }

//     }
// }



