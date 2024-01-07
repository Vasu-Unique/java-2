package String;
import java.util.*;
public class Longest_Common_Prefix {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String arr[]=new String[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.next();
        }

        Arrays.sort(arr);

        int end=Math.min(arr[0].length(),arr[a-1].length());
        int i=0;
        while(i<end && arr[0].charAt(i)==arr[a-1].charAt(i))
        {
            i++;
        }

        for(int j=0;j<i;j++)
        {
            System.out.print(arr[0].charAt(j));
        }
    }
}
