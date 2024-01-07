import java.util.*;
public class que5 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr1[]=new int [a];
        int arr2[]=new int [b];

        for(int i=0;i<a;i++)
        {
            arr1[i]=obj.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            arr2[i]=obj.nextInt();
        }
        int count=0;
         for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
            if(arr1[i]==arr2[j])
            {
                count++;
            }
            
        }
        
        }
        System.out.println(count);
}
}
