import java.util.Scanner;

public class TempSorting {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int arr[]=new int [a];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }

        int temp=0;
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>=arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
}
}