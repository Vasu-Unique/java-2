package Test.Mallow;
import java.util.*;
public class orderadd {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int a=obj.nextInt();
        int[] arr=new int[a];
        int count=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                for(int k=j+1;k<a;k++)
                {
                    if(arr[i]+arr[j]+arr[k]<=n)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
