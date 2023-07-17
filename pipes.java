import java.util.*;
public class pipes {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int b = obj.nextInt();
    int c = obj.nextInt();
    int arr1[]=new int[a];
    int sum1=0,sum2=0;

    for(int i=0;i<a;i++)
    {
        arr1[i]=obj.nextInt();
        sum1=sum1+arr1[i];
    }
    System.out.println(sum1);

    int arr2[]=new int[b];
    for(int i=0;i<a;i++)
    {
        arr2[i]=obj.nextInt();
        sum2=sum2+arr2[i];
    }
    System.out.println(sum2);

    if(sum1>sum2)
    {
        System.out.println(-sum1-sum2);
    }
    else
    {
                System.out.println(-sum1-sum2);

    }

}
    
}
