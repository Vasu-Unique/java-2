/*

  Write the code to print the GCD number using recursion
 
 */

public class GCD_num_Recursion {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 10;

        int result = gcd(num1, num2);
        System.out.println(result);
    }
}