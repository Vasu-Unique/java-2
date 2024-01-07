import java.util.Scanner;

public class ArrayWestEast {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++)
        {
            for(int j=i;j<a;j++)
            {
            if(arr[i]==0 && arr[j]==1)
            {
                count++;
            }
            }
        }
        System.out.println(count);
    }
}
