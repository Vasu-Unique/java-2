import java.util.*;
public class ReverseLongInt {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextInt();
        long rev=1;

        for(int i=0;i<a;i++)
        {
            
            rev=c*rev;
        }
        System.out.println(rev);
    }
}
