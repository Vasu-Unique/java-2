package Night;
import java.util.*;
public class MiddleElement {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        if(a%2==0)
        {
            int sum=a/2+1;
            System.out.println(sum);
        }
        else
        {
            int sum=a/2+1;
            System.out.println(sum);
        }

    }
}
