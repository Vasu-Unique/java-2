import java.util.*;

//Take 10 integer inputs from user and store them in an array and print them on screen.
public class array1 
{
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr[]=new int[a];

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }

    for(int i=0;i<a;i++)
    {
        System.out.print(arr[i]+" ");
    }
}

}
