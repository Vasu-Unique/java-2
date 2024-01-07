import java.util.*;
public class primeNu
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int flag=0;

        if(n==1||n==0)
        {
            System.out.println("NOT");
        }
        else{
            for(int i=2;i<=n/2;i++)  //Math.sqrt(n) use pannalam
            {
                if(n%i==0)
                {
                    System.out.println("NOT");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
    }
}