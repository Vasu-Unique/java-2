package Night;
import java.util.*;
public class CenterMatrix {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr[][]=new int[a][b];

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
               arr[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
               if(((i+j)%2==0) && (i+j!=4))
               {
                 arr[i][j]+=5;
               }  
               System.out.print( arr[i][j]+" ");     
            }
        System.out.println();
        }
    }
}
