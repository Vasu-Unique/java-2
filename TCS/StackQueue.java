package TCS;
import java.util.*;
public class StackQueue {
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

        int b=obj.nextInt();
        if(b%2==0)
        {
        int c=b/2,sum=0;
        int d=0,e=0;
        if(c%2!=0)
        {
            //System.out.println((c-1)*2);
            d=c/2*2;
            e=(c-1)*2;
            
            for(int j=0;j<e;j++)
            {
                sum=sum+arr[j];
            }
            for(int j=a-d;j<a;j++)
            {
                sum=sum+arr[j];
                //System.out.println(sum);
            }
            System.out.println(sum);
        }
        else
        {
            d=c;
            e=c;
            for(int j=0;j<e;j++)
            {
                sum=sum+arr[j];
            }
            for(int j=a-d;j<a;j++)
            {
                sum=sum+arr[j];
            }
            System.out.println(sum);   
        }
        }
        else
        {
            System.out.println("Not possible");
        }
        


        

        

        
}
}