package NumberPattern;

import java.util.Scanner;

public class NumPatternCount {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int j,i;
        int a=1;
        int arr[]=new int[n];
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {

                System.out.print(a+" ");  
            }
            System.out.println();
            
        }
    }
}
