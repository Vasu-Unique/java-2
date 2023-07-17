import java.util.*;
public class NutBolt {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        char arr[]={'!','#','$','%','&','*','@','^','~'};
        
        char[] arr1 = obj.nextLine().toCharArray();
        char[] arr2 = obj.nextLine().toCharArray();
        if(arr1.length==arr2.length)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr1.length;j++)
                {
                    if(arr[i]==arr1[j])
                    {
                        System.out.print(arr[i]+" ");
                    }
                }
            }
        }


    }
    
}