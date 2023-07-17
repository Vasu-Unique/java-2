package Level0;

import java.util.*;

public class print22 {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
            System.out.print(i+" ");
            }
        }
    }
}
