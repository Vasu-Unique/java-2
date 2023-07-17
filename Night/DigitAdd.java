package Night;
import java.util.*;
public class DigitAdd {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();
        int a;
        
        int sum=0;
        while(n!=0)
        {
            a=n%10;
            n=n/10;
            System.out.println(a);
            sum=sum+a;
        }
        System.out.println(sum);
        int b,sum1=0;
        while(sum!=0)
        {
            b=sum%10;
            sum=sum/10;
            sum1+=b;
        }
        System.out.println(sum1);


     }
}
