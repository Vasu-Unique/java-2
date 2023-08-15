import java.util.Scanner;

public class AddEvenI {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        int arr[]=new int[a];
        int sum=0;
        

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }
    for(int i=0;i<a;i++)
    {
        if(i%2==0)
        sum=sum+arr[i];
    }
    System.out.println(sum);

}
}
