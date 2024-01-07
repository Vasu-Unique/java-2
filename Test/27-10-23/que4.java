import java.util.*;
public class que4 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=2*a+2;
        int arr[]=new int [b];

        for(int i=0;i<b;i++)
        {
            arr[i]=obj.nextInt();
        }
        int sum=0;
         for(int i=0;i<b;i++)
        {
            sum=0;
            for(int j=0;j<b;j++)
            {
            if(arr[i]==arr[j] && i!=j)
            {
                sum=1;
                break;
            }
            
        }
        if(sum==0)
        {
            System.out.print(arr[i]+" ");
        }

        }
}
}