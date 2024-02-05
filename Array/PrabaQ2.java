import java.util.Scanner;

public class PrabaQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            // Reading the three initial numbers and n for each test case
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();

            // Calculate and print the nth term of the series
            int result = calculateNthTerm(a, b, c, n);
            System.out.println(result);
        }
    }

    // Function to calculate the nth term of the series
    private static int calculateNthTerm(int a, int b, int c, int n) {
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;

        int[] series = new int[n];
        series[0] = a;
        series[1] = b;
        series[2] = c;

        for (int i = 3; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2] + series[i - 3];
        }

        return series[n - 1];
    }
}
