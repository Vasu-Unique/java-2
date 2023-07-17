import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        sum+=a%10;
        System.out.println(sum);
    }
}
