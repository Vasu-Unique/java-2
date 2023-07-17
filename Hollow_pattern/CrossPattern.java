package Hollow_pattern;

public class CrossPattern {
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=1;j<=n;j++)
            {
            if (i==j || i+j==n+1)
                System.out.print("* ");
            else
                System.out.print("  ");
            }
        }
    }
}