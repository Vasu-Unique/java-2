import java.util.Scanner;

public class Seats {
    public static int countInvertedRightAngledTriangles(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == 1) {
                    int length = 0;
                    while (i + length < rowCount && j - length >= 0 && matrix[i + length][j - length] == 1) {
                        length++;
                    }
                    count += length;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int result = countInvertedRightAngledTriangles(matrix);
        System.out.println("Number of inverted right-angled triangles: " + result);
    }
}
