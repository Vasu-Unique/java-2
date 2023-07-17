/*Determine if the sum of two integers is equal to the given value
Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value. Return true if the sum exists and return false if it does not. Consider this array and the target sums:
5
7
1
2
8
4
3
Example 1:
Target Sum
10
7+3=10, 2+8=10
Example 2:
Target Sum
19
No 2 values sum up to 19
*/

import java.util.Scanner;
public class TwoInteger {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int arr[]={5,7,1,2,8,4,3};
        int a=obj.nextInt();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[i]+arr[j]==a)
                {
                    count++;  
                }
                
            } 
        }
        System.out.print(count);     
    }
}
