package Level0;
import java.util.*;
public class print15 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        
        for(int i=1;i<=3;i++)
        {
        int a=obj.nextInt();
        if((a%3==0)&&(a%5==0))
        {
            System.out.println("HiHello");
        }
        else if(a%5==0)
        {
            System.out.println("Hello");
        }
        else if(a%3==0)
        {
            System.out.println("Hi");     
        }
        }
    }
}
