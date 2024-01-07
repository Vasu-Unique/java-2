package Level0;
import java.util.*;
public class print29 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int ans=0;

        for(int i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                ans=ans+i;
            }
        }
        System.out.println(ans);
    }
}
