import java.util.*;
public class payoda1 {
    public static void main (String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int arr[]=new int[a];

		for(int i=0;i<a;i++)
		{
		    arr[i]=obj.nextInt();
		}

        int b=(Math.min(arr[0],arr[a-1]));
        int c=b*(arr.length-2);
        System.out.println(c);
        
    }
}
