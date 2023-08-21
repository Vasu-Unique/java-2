package TCS;
import java.util.*;

public class q40Prime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum=0;
        if (a == 1) {
            a++;
        }

        for (int i = a; i <= b; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.abs(i / 2); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.print(i + " ");
            sum=sum+i;    
        }
    }
    System.out.println();
    System.out.println(sum);
}
}