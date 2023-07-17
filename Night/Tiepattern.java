package Night;
import java.util.*;

class A
{
    void run(int x)
    {
        int i,j,n=x;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=i;j<n;j++)
            {
                System.out.print("#");
            }
            for(j=i;j<n;j++)
            {
                System.out.print("#");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Tiepattern
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        
        A o=new A();

        while(n1!=0)
        {
            int n=obj.nextInt();
            o.run(n);
            n1--;
        }
    }
}
