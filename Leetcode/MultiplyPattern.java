package Leetcode;

public class MultiplyPattern {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int sum=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(sum+" ");
                sum=sum*(j+1);
            }
            System.out.println();
        }
    }
}

// 1 
// 1 2
// 1 2 6
// 1 2 6 24
// 1 2 6 24 120
