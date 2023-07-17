package Test;
import java.util.*;

    public class test {
        public static void main(String[] args)
        {
         Scanner obj=new Scanner(System.in);
         int n=obj.nextInt();
         int arr[]=new int[n];
         
         for(int i=0;i<n;i++) {
             arr[i]=obj.nextInt();
         }
           System.out.print(bulb(arr, n));
        }
    

        static int bulb(int[] arr1, int N)
        {
              int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr1[i] == 0) {
                    arr1[i] = 1;
                    for (int j = i + 1; j < N; j++) {
                        if (arr1[j] == 1) {
                            arr1[j] = 0;
                        }
                        else {
                            arr1[j] = 1;
                        }
                    }
                    count++;
                }
            }
            return count;
        }
}
