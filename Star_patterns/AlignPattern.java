package Star_patterns;


// public class AlignPattern {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=i;j<=n;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }

public class AlignPattern {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
