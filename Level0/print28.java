package Level0;
import java.util.Scanner;
public class print28 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int ans=0;

        while(b-->0)
        {
            ans=ans+a;
        }
        System.out.println(ans);
    }
}
