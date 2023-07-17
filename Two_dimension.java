import java.util.Scanner;

public class Two_dimension {

	public static void main(String[] args) 
	{
	  Scanner obj=new Scanner(System.in);
	  int row=obj.nextInt();
	  int col=obj.nextInt();
    	int arr[][]=new int [row][col];
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
			  arr[i][j]=obj.nextInt();
		  
	  }
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
		  if(i==0)
		  {
			System.out.print(arr[i][j]+ " ");
		  }
		  else if(j==3)
		  {
			System.out.print(arr[i][j]+ " ");
		  }
		  else if(i==4)
		  {
			System.out.print(arr[i][j]+ " ");
		  }
	  }
      
	}
}