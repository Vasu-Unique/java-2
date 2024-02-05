import java.util.*;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int temp,sum=0,original=n;
        

        while(n>0)
        {
            temp=n%10;
            sum+=(temp*temp*temp);
            n=n/10;
        }

        if(original==sum)
        {
            System.out.println("Armstrong");
        }

    }
}
