package Level0;
import java.util.*;

import java.util.*;
public class print14 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        int a=obj.nextInt();
        int n;
        if(a%3==0)
        {
            System.out.println("The number is Divisible by 3");
        }
        else
        {
            n=a%3;
            System.out.println("The number is Not Divisible by 3 and gives a remainder "+n);
        }

    }
}
