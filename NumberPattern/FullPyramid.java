package NumberPattern;

//         1
//       2 3 2
//     3 4 5 4 3
//   4 5 6 7 6 5 4
// 5 6 7 8 9 8 7 6 5
public class FullPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            int p=i;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(p+" ");
                p++;
            }
            
            int a=;
            int q=n-;
            for(int j=1;j<i;j++)
            {
                q=q+j;
                System.out.print(q+" ");
                q--;
                
            }
        System.out.println();
        }
    }
    
}