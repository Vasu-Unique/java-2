import java.io.*;
import java.util.*;

public class MissingPositive {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]={ 0, 10, 2, -10, -20 };
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]>0)
            {
                int k=arr[i];
                //System.out.print(k+1);
                if(arr[i]!=k+1)
                {
                    System.out.println(k+1);
                }
            }
        }
        
        
        
        
    }
}