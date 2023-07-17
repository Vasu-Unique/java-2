import java.util.*;
public class Book {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    int m=obj.nextInt();
    int arr[]=new int [n];
    int a;
    for(int i=0;i<n;i++)
    {
        arr[i]=obj.nextInt();
    }
    a=n/2;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<=n)
        {
            System.out.println(arr[i]);
            System.out.println(arr[i+a]);
        }
        
    }

    }
}
