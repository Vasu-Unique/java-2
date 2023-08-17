import java.util.*;
public class MissingLetter {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine().toUpperCase();
        String b=obj.nextLine().toUpperCase();
        int count=0;
        int i;
        for( i=0;i!=a.length();i++)
        {
            if (a.charAt(i) != b.charAt(i)) {
                System.out.print(a.charAt(i));
               // break;
        }
        //System.out.println(count);
        }
        if (i == a.length()) {
            System.out.print("NA");
        }
         
    }
}
