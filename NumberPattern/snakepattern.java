package NumberPattern;
import java.util.*;
public class snakepattern {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
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
            if(i%2==0)
            {
                for(int j=0;j<a;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(int j=b-1;j<=a;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }




    }

}
