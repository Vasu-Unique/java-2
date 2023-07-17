package Night;
import java.util.*;
public class ArrayEquals1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr1[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr1[i]=obj.nextInt();
        }

        int b=obj.nextInt();
        int arr2[]=new int[b];

        for(int j=0;j<b;j++)
        {
            arr2[j]=obj.nextInt();
        }

        for(int i=0;i<a;i++)
        {
          
        if(arr1[i]==arr2[i])
        {
           flag=1;
        }
        else
        {
            flag=-1;
            break;
        }
        }
        System.out.print flag==1:;
       
        

    }
}
