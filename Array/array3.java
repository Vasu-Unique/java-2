package Array;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

// Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.
public class array3 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int arr[]=new int [a];
        int pos=0,neg=0,odd=0,even=0,zero=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]<0)
            {
                neg++;
            }
            if (0<arr[i])
            {
                pos++;
            }
            if(arr[i]%2!=0)
            {
                odd++;
            }
            if(arr[i]%2==0)
            {
                even++;
            }
            if(arr[i]==0)
            {
                zero++;
            }
        }

        System.out.println("Positive:"+pos+"\nNegative:"+neg+"\nOdd:"+odd+"\nEven:"+even+"\nZero:"+zero);
        
        
    }
}
