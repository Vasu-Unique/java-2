package Level0;
import java.util.*;
public class print7 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.printf("%05d",a);
        System.out.printf("\n%5d",b);

    }
}
/*
input
95
28

output
00095
   28 */