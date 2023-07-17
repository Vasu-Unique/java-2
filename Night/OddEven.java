package Night;
import java.util.*;
public class OddEven {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        int sum1=0;
        int sum2=0;

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        if(arr[i]%2==0)
        {
            sum1=sum1+arr[i];
        } 
        else
        {
            sum2=sum2+arr[i];
        }
        } 
        System.out.println("Odd "+sum2);
        System.out.println("Even "+sum1);
        
    } 

}
