import java.util.*;
public class ProductDigit {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a= obj.nextInt();
    int arr[]=new int [a];
    int sum=1;

    for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }

    for(int i=0;i<arr.length;i++)
        {
            sum=sum*arr[i];
        }
    
        System.out.println(sum);   
}
}