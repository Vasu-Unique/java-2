package Serv;
import java.util.*;
public class pattern {
    pattern()
    {
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String args[])
    {
        pattern obj=new pattern(); 
    }
}
