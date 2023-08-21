import java.util.*;
public class Tim {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String find=sc.next();
       String res="";
       
       int count=0;
       int sol=(str.length()-find.length());
        char arr[]=str.toCharArray();
        for (int i = 0; i <=sol; i++) {
            for (int j = i; j <i+find.length(); j++) {
               res=res+arr[j];
            }
            if(res.equals(find))
            {
                count++;
            }
            res="";
        }
        System.out.println(count);
    }
}