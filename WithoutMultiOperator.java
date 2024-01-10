import java.util.*;
public class WithoutMultiOperator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int sum=0;

        for(int i=1;i<=b;i++)
        {
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
