package Night;
import java.util.*;
public class ZeroSum {
    public static void main(String args[])
    {
        int sum=0;
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];//sum=sum+arr[i];
                if(arr[i]==0||sum==0)
                {
                    System.out.println("Subarray with zero-sum exists");
                }
                else{
                    System.out.println("zero-sum NOT exists");
                }
        System.out.println();
        }
        
    }
}
