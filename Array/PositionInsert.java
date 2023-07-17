import java.util.*;

public class PositionInsert {
    public static void main (String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int arr[]=new int[a];
        int sum=0;

		for(int i=0;i<a;i++)
		{
		    arr[i]=obj.nextInt();
		}
        Arrays.sort(arr);
        System.out.println("Minimum: "+arr[0]);
        System.out.println(arr[arr.length-1]);

        for(int i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("Avg: "+sum/arr.length);


    }
}
