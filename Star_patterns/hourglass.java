package Star_patterns;
import java.util.*;
public class hourglass {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||i==n/2+1&&j==n/2+1||i==j||i+j==n+1||i==j+1&&i+j==n+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}
