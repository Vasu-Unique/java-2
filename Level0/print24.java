package Level0;
import java.util.*;
public class print24 {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();

        if(n>0)
        {
            while(n%2==0)
            {
                n=n/2;
            }
        }
        if(n==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
