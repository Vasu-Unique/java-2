package Level0;
import java.util.*;
public class print11 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("Odd");
        }
    }
}
/*
  input
  123  op odd
  124  op even
 */