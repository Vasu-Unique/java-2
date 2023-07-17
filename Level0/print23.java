package Level0;

import java.util.*;

public class print23 {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
            System.out.print(i+" ");
            }
        }
    }
}

/*
 * input
 * 2
   10
   output
   2 4 6 8 10 
 */
