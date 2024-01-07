import java.util.*;
public class Arraypair {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr1[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            arr2[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
