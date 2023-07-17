package Level0;
import java.util.*;
public class print10 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        int n=obj.nextInt(); 
        if(0>=n)
        {
            System.out.println(+n);
        }
        else
        {
            System.out.println("+"+n);
        }
    }
}

//output 
//print  +20 -20
