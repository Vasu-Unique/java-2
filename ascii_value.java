import java.util.Scanner;

public class ascii_value {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        char c = obj.next().charAt(0);
        int ascii = (int) c;
        System.out.println("The ASCII value of " + c + " is:  "+ascii);
    }
    
}
