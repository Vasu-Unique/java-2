import java.util.*;
public class code9 {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
            sum=sum+i;
            }
        }
        System.out.println(sum);
    
    }
}
