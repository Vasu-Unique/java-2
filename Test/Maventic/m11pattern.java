package Test.Maventic;
import java.util.*;
public class m11pattern {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
            if (i==1|| i==n || j==1 || j==n || i==j || i+j==n+1||j==n/2+1 )
                System.out.print("* ");
            else
                System.out.print("  ");
            }
        System.out.println();
        }
    }
}
