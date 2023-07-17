import java.util.*;
 
public class ArrayMatrixSprial
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int arr[][]=new int [a][b];
        int rowbegin=0,rowend=a-1,colbegin=0,colend=b-1;

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        
        while(rowbegin<=rowend && colbegin<=colend)
        {
            //traverse right
            for(int j=colbegin;j<=colend;j++)
            {
                System.out.print(arr[rowbegin][j]+" ");
            }
            rowbegin++;
            //traverse down
            for(int j=rowbegin;j<=rowend;j++)
            {
                System.out.print(arr[j][colend]+" ");
            }
            colend--;
            //traverse left
            for (int j=colend;j>=colbegin;j--)
            {
                System.out.print(arr[rowend][j]+" ");
            }
            rowend--;
            //trverse up
            for(int j=rowend;j>=rowbegin;j--)
            {
                System.out.print(arr[j][colbegin]+" ");
            }
            colbegin--;
        }    
    }
}
