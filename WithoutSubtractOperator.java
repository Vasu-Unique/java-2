import java.util.*;
public class WithoutSubtractOperator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        while(b!=0)
        {
            a--;
            b--;
        }
        System.out.println(a);
    }
}

// public class WithoutSubtractOperator {
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         int a=obj.nextInt();
//         int b=obj.nextInt();

//         int c=a+~b+1;
//         System.out.println(c);
//     }
// }

