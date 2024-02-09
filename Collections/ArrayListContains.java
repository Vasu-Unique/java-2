package Collections;
import java.util.*;
public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");

        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();

        if(al.contains(a))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        obj.close();  //best practise to prevent from data leakage
    }
}
