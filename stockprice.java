import java.util.*;
public class stockprice {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];
        

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

        System.out.print('1');

        for(int i=1;i<a;i++)
        {
            int count=1;
            for(int j=0;j<i;j++)
            {
            if(arr[i]>arr[j])
            {
                count++;
            }
            }
        System.out.print(" "+count); 
        }

    }
    
}
