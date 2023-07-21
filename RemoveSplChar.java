import java.util.*;
public class RemoveSplChar {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine().toUpperCase();;
        
        char arr[]=a.toCharArray();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>=(char)65 && (char)90>=arr[i]))
            {
                count++;
            }
            if(arr[i]>='0' && arr[i]<='9')
            {
                count++;
            }
        }
        System.out.println(arr.length-count);
    }
}
