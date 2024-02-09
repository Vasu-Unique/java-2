import java.util.*;
public class OcuurenceNum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }
        occur(arr);
    }

    static void occur(int arr[])
    {
        int count;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count+=count;
                } 
            }
            System.out.println(arr[i]+" "+count);
            i=i+(count-1);

        }
    }
}
