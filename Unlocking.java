import java.util.*;
public class Unlocking {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int arr[]=new int [a];

    for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
    
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        

}
}