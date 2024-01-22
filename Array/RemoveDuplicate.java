    import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();   
        int arr[] = new int[n];
        int arr1[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int z=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[i]!=arr[j])
                {
                    arr1[z]=arr[j];
                    System.out.print(arr[z]+" ");
                    // System.out.print(z+" ");
                    z++;
                    System.out.print(z+" ");
                     System.out.println();
                    
                }
            }
         }
         for(int i=0;i<z;i++)
         {
            System.out.println(arr1[i]);
         }
            
               
        }
    }
