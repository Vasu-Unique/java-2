package Hollow_pattern;

public class HollowHill {
    public static void main(String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<i;j++)
            {
                if(i==n||j==1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                if (i==n||i==j)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
        }
    }
}
