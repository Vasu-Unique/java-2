import java.util.*;
public class ProgramPattern {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        //char[] arr = obj.nextLine().toCharArray();
        String a="PROGRAM";
        int n=a.length();
        int i,j;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i==j || (i+j==n+1))
                {
                System.out.print(a.charAt(i)); 
                //System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

    }
}

// import java.util.*;
// public class ProgramPattern {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         int n=str.length();
//         if(n%2!=0) {
//         	for(int i=0;i<n;i++) {
//         		int j=n-1-i; 
//     			for (int k=0;k<n;k++) { 
//     				if (k==i||k==j) 
//     					System.out.print(str.charAt(k)); 
//     				else
//     					System.out.print(" "); 
//     			} 
//     			System.out.println("");
//         	}
//         }
// 	}
// }
