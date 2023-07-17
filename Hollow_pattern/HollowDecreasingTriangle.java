package Hollow_pattern;

public class HollowDecreasingTriangle {
    public static void main (String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=i;j<=n;j++)
            {
                if(i==1||j==i||j==n)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
        }

    }
}
