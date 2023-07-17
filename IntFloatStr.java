import java.util.Scanner;

public class IntFloatStr {
    public static void main (String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt();
        float n2 = obj.nextFloat();
        char n3 = obj.next().charAt(3);
        System.out.printf("%d\n%f\n%s",n1,n2,n3);
    }
}
