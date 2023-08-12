import java.util.*;
public class TwoDiArrayStrongNum {

    public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int row=obj.nextInt();
		int col=obj.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        arr[i][j]=obj.nextInt();
		    }
		}

        for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
                    if(i!=0&&j!=0)
                    {
                    if(arr[i][j]>arr[i][j+1]&&arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i-1][j-1]&&arr[i][j]>arr[i-1][j+1]&&arr[i][j]>arr[i+1][j+1]&&arr[i][j]>arr[i+1][j-1])
                    {
                        System.out.println(arr[i][j]);
                    }
                    }
            }
        }


		    }
		}

		
		// for(int i=0;i<a;i++)
		// {
		//     for(int j=0;j<b;j++)
		//     {
		//         System.out.print(arr[i][j]+" ");
		//     }
		//    System.out.println();
		// }


