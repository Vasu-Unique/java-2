import java.util.*;
public class ArrayIncrease {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int count=1;
        for(int i=0;i<a-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
            }
        }
        if(count==a)
        {
            System.out.println("Array is strictly increasing");
        }
        else
        {
            System.out.println("Not Increasing");
        }
    }
}
