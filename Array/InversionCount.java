import java.util.Scanner;

public class InversionCount {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int arr[]=new int [a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        int count=0;
        
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            
        }
        System.out.println(count);

}
}