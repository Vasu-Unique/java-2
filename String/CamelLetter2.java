package String;
import java.util.*;
public class CamelLetter2 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String n=obj.nextLine();
        char arr[]=n.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
            arr[i]=Character.toUpperCase(arr[i]);
            }
            if(arr[i]==' ')
            {
                arr[i+1]=Character.toUpperCase(arr[i+1]);
            }
        }
        System.out.println(arr);

    }
    
}
