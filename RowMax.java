import java.util.Scanner;
public class RowMax {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int sum=0,max=0;
        int arr[][]= new int[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
            sum=arr[i][j];
            if(max<sum)
            {
                max=sum;
            }
            }
            System.out.println(max);
        }
    }
}
