import java.util.*;
public class RemoveSplLow {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char arr[]=a.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>=(char)65 && (char)90>=arr[i]))
            {
                System.out.print(arr[i]);
            }
            if(arr[i]>='0' && arr[i]<='9')
            {
                System.out.print(arr[i]);
            }
        }
    }
}

