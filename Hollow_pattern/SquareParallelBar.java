package Hollow_pattern;

public class SquareParallelBar {
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=1;j<=n;j++)
            {
                if(j==1||j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        }
    }
}
