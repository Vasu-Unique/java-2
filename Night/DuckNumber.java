package Night;
import java.util.*;
public class DuckNumber {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        while(n!=0)
        {
        if(n%10==0)
        {
            System.out.println("It is not a Duck Number");
        }
        else{
            System.out.println("Duck Number");
        }
        
        }
    }
}
