package Test.Maventic;
import java.util.*;
public class m6AlphabetRemove {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<String>();
        String a=obj.nextLine();
        arr.add(a);

        for(int i=0;i<a.length();i++)
        {
            arr.add(obj.nextLine());
        }
        System.out.println(arr.toString().replace("[","").replace("]",""));
    }
}
