package String;
import java.util.Scanner;
// public class EmailValid {
//      public static void main(String args[])
//     {
//         Scanner obj=new Scanner(System.in);
//         String s=obj.nextLine();
//         String w="";

//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             if(s=="@"||Character.isLowerCase(ch))
//             { 
//                 w=w+s;
//             }
//             else
//             {
//                 System.out.println("NOt");
//             }
//         }
//         //System.out.println(w);
//     }
// }

import java.util.*;
class EmailValid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int flag=0;
        for(int i=0;i<str.length()-1;i++){
            if((Character.isUpperCase(arr[i]))){
                System.out.print("No");
                flag=1;
                break;
            }
        }
        if(flag!=1)
        {
        for(int i=0;i<str.length()-1;i++){

            if((arr[i]=='@') && (str.contains(".com")) || str.contains(".in")){
                System.out.print("Yes");
                break;
            }
            else{
                System.out.print("No");
                break;
            }
        }
    }
        

    }
}
