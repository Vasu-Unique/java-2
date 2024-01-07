import java.util.Scanner;

public class StockMarket {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr[]=new int[a];
    int profit=0;

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }

    if(a%2!=0)
    {
        int b=a/2+1; //3
        int c=a%2+1;  //2

        for(int j=0;j<b;j++)
        {
            if(j!=a-1)
            {
                if(arr[j]<=arr[j+1])
                {
                    profit=1;
                }
                else{
                    profit=0;
                }
            }
            else if(j!=a-1)
            {
                if(arr[j]<=arr[j+1])
                {
                    profit=1;
                }
                else{
                    profit=0;
                }
            }  
        }

        for(int j=b+1;j<a;j++)
        {
            if(j!=a-1)
            {
                if(arr[j]<=arr[j+1] )
                {
                    profit=1;
                }
                else{
                    profit=0;
                }
            }
            else if(j!=a-1)
            {
                if(arr[j]<=arr[j+1])
                {
                    profit=1;
                }
                else{
                    profit=0;
                }
            }  
        }
    }

    if(profit==1)
        System.out.println(profit);
    else if(profit==0)
        System.out.println("No profit");
}
}