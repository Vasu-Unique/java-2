package TCS;
import java.util.*;
public class SubArray {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,3};
        int k=3,ans=0;
        
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
