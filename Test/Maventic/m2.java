package Test.Maventic;
import java.util.*;
public class m2 {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr[]=new int[a];

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }
    Arrays.sort(arr);
    int b = obj.nextInt();
    System.out.println(arr[b-1]);


}
}