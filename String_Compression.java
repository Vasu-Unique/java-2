import java.util.*;
public class String_Compression {
    public static void main ( String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char arr[]=a.toCharArray();
        int count=0;

        for(int i=0;i<a.length();i++)
        {
            if(arr[i]==arr[0])
            {
                count++;
            }
        }
        System.out.println(arr[0]+""+count);

    }
}
