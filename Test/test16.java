package Test;
import java.util.*;

public class test16 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine().toLowerCase();
        char[] arr=a.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextLine();
        }


    }
}