package Level0;
import java.util.*;
public class print13 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        int n=obj.nextInt(); 
        if(0>n)
        {
            System.out.println("Negative");
        }
        else if(0==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Positive");
        }
    }
}

/*
 input 12  op  negative
 input -12 op  positive
 input 0   op   zero
 */