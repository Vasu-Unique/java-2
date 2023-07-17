package String;
import java.util.*;
import java.util.regex.Pattern;
public class Stringsplit {
    public static void  main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        String a="Vasanth from bhavani";
        String b="ww.vasanth.com";
        String[] arr1=a.split(" "); //   \\s->spaca split  \\.dot split   //argument  REGEX-regular Experssion

        for(String d:arr1) System.out.println(d);  //this called for each loop

        Pattern p = Pattern.compile("\\."); //regex pattern
        String[] arr2=p.split(b);  //arugment String
        for(String c:arr2) System.out.println(c);

    }
    
}
