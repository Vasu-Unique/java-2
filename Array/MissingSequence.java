import java.util.Scanner;

public class MissingSequence {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,4,5,7};

        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i]+1!=arr[i+1])
            {
                System.out.println(arr[i]+1);
            }
            
        }
        // int arr[]={1,2,3,5,6,7,8,9,10};

        // for(int i=0;i<arr.length-1;i++)
        // {
        //     int count=0;
        //     if(arr[i]+1!=arr[i+1])
        //     {
        //         count++;
        //         //System.out.println(arr[i]+1);
        //     }
        //     if(count>0)
        //     {
        //         System.out.println(arr[i]+1);
        //     }
        // }
}
}