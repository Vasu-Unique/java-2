import java.util.Scanner;

public class lartgest_num {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr[]=new int[a];

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }

    int len=arr[0];
    for(int i=0;i<a;i++)
    {
        if(len<arr[i])
        {
            len=arr[i];
        }
    }
    System.out.println(len);

}
}