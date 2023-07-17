package NumberPattern;
import java.util.*;
public class snake2 {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1,p=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print(p+++" ");
            }
        System.out.println();
        }
    }
}
