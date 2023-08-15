import java.util.*;
public class IndexValue {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        int arr[]=new int[a];
        int b = obj.nextInt();
        int c = obj.nextInt();
        

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }

    for(int i=0;i<a;i++)
    {
        if(arr[i]>=b && arr[i]<=c)
            System.out.print(i);
    }


}
}