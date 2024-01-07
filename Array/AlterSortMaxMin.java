import java.util.Arrays;
import java.util.Scanner;

public class AlterSortMaxMin {
     public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int arr[]=new int [a];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }

        Arrays.sort(arr);
            for(int i=0;i<a/2;i++)
            {
                System.out.print(arr[a-i-1]+" ");
                System.out.print(arr[i]+" ");    
            }
            if(a%2!=0)
            {
            System.out.print(arr[a/2+1]+" ");
            }
    }
}


/*
Input: 
1 2 3 4 5 6 7 
Output: 
7 1 6 2 5 3 4 
Example Input/Output 2: 
Input: 
10 99 44 22 56 63 
Output: 
99 10 63 22 56 44
*/