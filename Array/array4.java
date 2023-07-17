package Array;
import java.util.*;

//Take 10 integer inputs from user and store them in an array
// Now, copy all the elements in an another array but in reverse order.
public class array4 {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int arr[]=new int [a];

    for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }

    }
}
