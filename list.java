import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        // Initialization of list
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        List<Integer> lis = new ArrayList<>();
        lis.add(s);

        // Output list initialization
        List<Integer> out = new ArrayList<>();

        for (int num : lis) {
            // Checking condition
            if (num % 2 == 0) {
                out.add(num);
            }
        }

        // Printing output
        System.out.println(out);
    }
}
