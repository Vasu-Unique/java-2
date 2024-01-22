package Collections.List;
import java.util.*;
public class ArrayListInsert {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList <Integer>();
        int size=obj.nextInt();

        for(int i=0;i<size;i++)
        {
            arr.add(obj.nextInt());
        }

        //System.out.println(arr);

        arr.add(obj.nextInt());
        //System.out.println(arr);
        int temp=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++)
            {
            if(arr.get(i)>arr.get(j) )
            {
                temp=arr.get(i);
                arr.add(arr.get(i),arr.get(j));
                arr.set(arr.get(j),temp);
            }
        }
        }
        // Collections.sort(arr);
        // Collections.sort(arr,Collections.reverseOrder());
        //System.out.println(arr.toString().replace("[","").replace("]","").replace(",",""));
        System.out.println(arr);

        

    }
}
