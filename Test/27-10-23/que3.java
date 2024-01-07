import java.util.*;

public class que3 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int b=obj.nextInt();
        int arr[]=new int [b];
        int sum1=0,sum2=0;

        for(int i=0;i<b;i++)
        {
            arr[i]=obj.nextInt();
        }

         for(int i=0;i<b;i++)
        {
            if(i%2!=0)
            {
                sum1+=arr[i];
            }
            else
            {
                sum2+=arr[i];
            }   
        }
        if(sum1>sum2)
        {
            System.out.println(sum1);
        }
        else
            System.out.println(sum2);

        }
}

