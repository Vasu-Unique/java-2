package Night;
import java.util.*;
public class Single {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
        
        int a,b;
        int sum=0;
        while (n > 0 || sum > 9)
        { 
            a=n%10;
            sum=sum+a; 
            a=a/10;    
        }
        
        System.out.println(a);
    }
}
