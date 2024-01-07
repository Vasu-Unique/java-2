import java.util.*;

public class Seive{
    public static void main(String[] args) {
        int num = 30;

        // Initialize an array to track prime numbers
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }

        int p = 2;

         while (p <= num) {
            if (isPrime[p]) {
                System.out.println(p);
                for (int i = 2 * p; i <= num; i += p) {
                    isPrime[i] = false;
                }
            }
            p++;
        }
    }
}