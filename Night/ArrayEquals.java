package Night;
import java.util.*;
public class ArrayEquals {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);

        int a=obj.nextInt();
        int arr1[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr1[i]=obj.nextInt();
        }

        int b=obj.nextInt();
        int arr2[]=new int[b];
        for(int i=0;i<a;i++)
        {
            arr2[i]=obj.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

    }
}
