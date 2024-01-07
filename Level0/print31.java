package Level0;
import java.util.Scanner;
public class print31 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        double a=obj.nextInt();
        int rem;

        while(a!=0)
        {
            rem=a%10;
            System.out.println(rem);
            a=a/10;
        }


    }
}
