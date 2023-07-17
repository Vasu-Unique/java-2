package Test.Maventic;
import java.util.*;
public class m5 {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr[]=new int[a];
    int temp=0;

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }
    for(int i=0,j=i+1;i<a;i++,j++)
    {
        
            if(arr[i]==arr[j])
            {
               // System.out.println(arr[i]+" ");
                if(temp==0)
                {
                    temp=temp+arr[i];
                }
                break;
            }
        
        
    }
    System.out.println(temp);
    
}
}
