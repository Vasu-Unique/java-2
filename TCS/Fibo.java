package TCS;
import java.util.*;
public class Fibo {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int count=obj.nextInt();
        int n1=0,n2=1,n3=0;

        for(int i=2;i<=count;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);

    }
    
}
