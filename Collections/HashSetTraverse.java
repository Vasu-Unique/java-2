package Collections;
import java.util.*;
public class HashSetTraverse {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);

        Iterator<Integer> itr=hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // for(int i:hs)
        // {
        //     System.out.println(i);
        // }
    }
}
