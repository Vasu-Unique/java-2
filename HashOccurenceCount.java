import java.util.*;

// public class HashOccurenceCount {
//     public static void main(String args[])
//     {
//        // String a="aabcdefef";
//         //String a="aabacdedefeef";
//         String a="aaabdefgg";
//         char arr[]=a.toCharArray();
//         Arrays.sort(arr);
//         String b="";
//         int count=0;

//         for(int i=0;i<a.length()-1;i++)
//         {
//             if(arr[i]!=arr[i+1])
//             {
//                 b=b+arr[i]; 
//             }      
//         }
//         b=b+arr[a.length()-1];
//         System.out.print(b);
//         System.out.println();

//         char arr1[]=b.toCharArray();
//         for(int i=0;i<arr1.length;i++)
//         {
            
//             for(int j=0;j<a.length();j++)
//             {
//                 if(arr1[i]==arr[j])
//                 {
//                     count++;
//                 }
//             }
//             System.out.println(arr1[i]+" "+count);
//             count=0;         
//         }
//     }
// }


public class HashOccurenceCount {

    public static void main(String args[])
    {
        String a="aaabdedfg";
        char arr1[]=a.toCharArray();
        Arrays.sort(arr1);
        String b="";

        for(int i=0;i<a.length()-1;i++)
        {
            if(arr1[i]!=arr1[i+1])
            {
                b=b+arr1[i];
            }
        }
        b=b+arr1[a.length()-1];
        System.out.println(b);

        char arr2[]=b.toCharArray();
        int count=0;

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    count++;
                }
            }
            System.out.println(arr2[i]+" "+count);
            count=0;
        }

    }
}