import java.util.*;
public class TwoDArray{
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int arr[][]=new int [a][a];

    for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                arr[i][j]=obj.nextInt();
            }
            
        }
    
    for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(i!=0 && j!=0 && i!=a-1 && j!=a-1)
                {
                    System.out.println(arr[i][j]+" ");
                }
            }
            
        }
    
}
}