import java.util.Scanner;

public class PrabaPen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] pens = new int[n];

        for (int i = 0; i < n; i++) {
            pens[i] = scanner.nextInt();
        }

        int extraPens = scanner.nextInt();

        int[] result = distributePens(n, pens, extraPens);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }

    private static int[] distributePens(int n, int[] pens, int extraPens) {
        int maxPens = 0;

        
        for (int i = 0; i < n; i++) {
            if (pens[i] > maxPens) {
                maxPens = pens[i];
            }
        }

        int[] result = new int[n];

       
        for (int i = 0; i < n; i++) {
            if (pens[i] + extraPens >= maxPens) {
                result[i] = 1;
            }
        }

        return result;
    }
}