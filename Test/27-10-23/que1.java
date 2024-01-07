import java.util.*;

public class que1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int [a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int b=obj.nextInt();
         
        for(int i=b;0<i;i--)
        {
            System.out.print(arr[i-1]+" ");   
        }
        for(int i=a-1;b<=i;i--)
        {
            System.out.print(arr[i]+" ");   
        }

       
}
}
