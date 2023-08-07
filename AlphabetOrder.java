import java.util.*;
public class AlphabetOrder {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        String n=obj.nextLine();
        char arr[]=n.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<n.length();i++)
        {
           System.out.print(arr[i]);
        }
    }
}
