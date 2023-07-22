package Test;
import java.util.*;
public class test19 {

    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int arr[]=new int [a];

    for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
    Arrays.sort(arr);
    
     for(int i=a-1;i<a;i--)
     {
        System.out.print(arr[i]+" ");
        if(i==0)
        {
            break;
        }
     }
    }
}