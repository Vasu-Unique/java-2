package Test.Maventic;
import java.util.*;
public class m4 {
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
        for(int j=i+1;j<a;j++)
        {
            if(arr[i]==arr[j])
            {
                System.out.print(arr[i]+" ");
                break;
            }
        }
    }
    


}
}
