/*Given an Array, To find if there exists a Position whose sum of elements in left equals the sum of elements at right. 
Write a function to find if there exists at least one point / index , whose left side sum of elements equals right side sum of elements.
Input: 
    1   2   3   4  2 
Output:
       3
Solution:
Left) 1 + 2 + 3 = 6
Right) 4 + 2 = 6 */

import java.util.*;

public class shlok1 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(); //7
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt(); // 1 2 3 4 2 3 7
        }
        int c=a/2+1; //4
        int d=a%2+1; //3
        int sum1=0,sum2=0;
        for(int i=0;i<c;i++)
        {
            sum1=sum1+arr[i]; //10
        }
        for(int i=a-d;i<a;i++)
        {
            sum2=sum2+arr[i]; //13
        }
        if(sum1==sum2)
        {
            System.out.println(arr[c]);
        }
    }
}  

