package Level0;
import java.util.*;
public class print25 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        for(int i=1;i<=a;i++)
        {
            System.out.println(i+"*"+b+"="+i*b);
        }
    }
}

/*
 * Print the multiplication table as per the multiplicant and n.
 * intput 
 * 6
 * 5
 * 
 * o/p
 * 1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
 */
