package Night;
import java.util.*;
public class Median {
    public static void main (String args[])
    {
    Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

        if(a%2==0)
        {
            int b;
            b=a/2;
            System.out.println(b+0.5);
        }
        else
        {
            System.out.println(arr[a/2]);
        }
    }
}
