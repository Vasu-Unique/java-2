package Test;
import java.util.*;
public class test9 {
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);    
        int s=obj.nextInt();
        int n=obj.nextInt();
        int p;
        int num = 1, dem = 1, s = p;
        while (p != 1)
        {
            dem *= p;
            p--;
        }
 
        int t = n - s + 1;
        while (t != (n - 2 * s + 1))
        {
            num *= t;
            t--;
        }
 
        if ((n - s + 1) >= s)
            System.out.print(num / dem);

    }
}
