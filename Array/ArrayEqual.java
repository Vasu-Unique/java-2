import java.util.Scanner;

public class ArrayEqual {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr1[]=new int[a];
    int arr2[]=new int[a];

    for(int i=0;i<a;i++)
    {
        arr1[i]=obj.nextInt();
    }
    for(int i=0;i<a;i++)
    {
        arr2[i]=obj.nextInt();
    }
    int count=0,dup=0;
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<a;j++)
        {
        if(arr1[i]==arr1[j] && j!=i)
        {
            a--;
        }
        } 
    }
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<a;j++)
        {
        if(arr1[i]==arr2[j] && j!=i)
        {
            a--;
        }
        } 
    }
    if(count>=a)
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("No");
    }
}
}
