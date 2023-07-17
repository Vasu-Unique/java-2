package Night;
import java.util.*;
public class StringVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String mystring=sc.nextLine();
        //char[] ch=sh.toCharArray();
        int count=0,cnt=0,cntt=0;
        for(int i=0;i<mystring.length();i++){
            char ch=mystring.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    cnt++;
                if(count>1){
                    System.out.println();
            }
            // cnt++;
        }}
              System.out.println("1");
               for(int i=2;i<=4;i++){
            char ch=mystring.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    cntt++;
                if(cntt>1){
                    System.out.println();
            }
            // cnt++;
        }}
              System.out.println("2");
              
        for(int i=0;i<mystring.length();i++){
            char ch=mystring.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             count++;
        }
               System.out.println(count+" ");
    }
}
