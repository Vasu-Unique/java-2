package Collections;
import java.util.Collection;
import java.util.*;
public class ArraylistToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);

        Integer arr[]=al.toArray(new Integer[0]);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
