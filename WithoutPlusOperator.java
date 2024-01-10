import java.util.*;
public class WithoutPlusOperator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        while(b!=0)
        {
            a++;
            b--;
        }
        System.out.println(a);

    }
}
