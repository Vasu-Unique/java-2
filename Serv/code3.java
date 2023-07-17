import java.util.Arrays;
import java.util.*;
public class code3 {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Array 1");
        int a=obj.nextInt();
        int arr1[]=new int [a];
        for(int i=0;i<a;i++)
        {
            arr1[i]=obj.nextInt(); 
        }

        int b=obj.nextInt();
        int arr2[]=new int [b];
        for(int j=0;j<b;j++)
        {
            arr2[j]=obj.nextInt(); 
        }
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }
}

