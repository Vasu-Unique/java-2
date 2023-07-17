package Night;
import java.util.*;
public class pair {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int b=obj.nextInt();
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==b)
                {
                    System.out.println(arr[i]+","+arr[j]);
                }
                else{

                }
            }
        }
    }
}
