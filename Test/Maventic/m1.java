
import java.util.*;
public class  m1{

	public static void main(String[] args) {
		Scanner SS=new Scanner(System.in);
		int n=SS.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=SS.nextInt();
		}
		int peak = findPeakElement(arr);
        if (peak != -1) {
            System.out.println( peak);
        } else {
            System.out.println("NO PEak");
        }
	}
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] >= arr[1]) {
            return arr[0];
        }
        if (arr[n-1] >= arr[n-2]) {
            return arr[n-1];
        }
        for (int i = 1; i < n-1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }
  
}
