import java.util.*;
 
class ArrayMatrixChange{
 
    static void print(int arr[][], int i, int j, int m, int n)
    {
        
        if (i >= m || j >= n) {
            return;
        }
 
        for (int p = i; p < n; p++) {
            System.out.print(arr[i][p] + " ");
        }
 
        for (int p = i + 1; p < m; p++) {
            System.out.print(arr[p][n - 1] + " ");
        }
 
        if ((m - 1) != i) {
            for (int p = n - 2; p >= j; p--) {
                System.out.print(arr[m - 1][p] + " ");
            }
        }
 
        if ((n - 1) != j) {
            for (int p = m - 2; p > i; p--) {
                System.out.print(arr[p][j] + " ");
            }
        }
        print(arr, i + 1, j + 1, m - 1, n - 1);
    }
 

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
	    int R=obj.nextInt();
	    int C=obj.nextInt();
    	int ar[][]=new int [R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            ar[i][j]=obj.nextInt();
        }
        print(ar, 0, 0, R, C);
    }
}
