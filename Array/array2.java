package Array;
import java.util.*;

//Take 10 integer inputs from user and store them in an array.
// Again ask user to give a number. Now, tell user whether that number is present in array or not.
public class array2 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        int n=obj.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
           // System.out.println(arr[i]+" "+n);
            if(arr[i]==n)
            {
               // System.out.println("test");
                flag=1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
}
}
