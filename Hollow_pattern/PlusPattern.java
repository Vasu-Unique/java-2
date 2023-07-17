package Hollow_pattern;

public class PlusPattern {
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=1;j<=n;j++)
            {
                if(i==n/2+1 || j==n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        }
    }
}
