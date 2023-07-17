package Array;
import java.util.*;
 
class test2 {

    static long ans(int n, int m)
    {
        int arr1[] = { -2, -1, 1, 2 };
        int arr2[] = { 1, 2, 2, 1 };
 
        long temp = 0;
 
        for (int i = 0; i < m; ++i) 
        {
            for (int j = 0; j < n; ++j)
             {
                for (int k = 0; k < 4; ++k) 
                {
                    int x = i + arr1[k];
                    int y = j + arr2[k];
 
                    if (x >= 0 && x < m && y >= 0 && y < n)
                        ++temp;
                }
            }
        }
 
        long total = m * n;
        total = total * (total - 1) / 2;
        return 2 * (total - temp);
    }
 
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int b= obj.nextInt();
        System.out.println(ans(a, b));
    }
}
