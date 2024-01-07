package NumberPattern;
import java.util.*;
public class IncreasingNumPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j,i;
        int a=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;  
            }
            System.out.println();
            
        }
    }
}
