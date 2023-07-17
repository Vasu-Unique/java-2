package Test;
import java.util.*;
public class test2  
{    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);    
        String string = obj.nextLine();    
        String rev = "";    

        for(int i = string.length()-1; i >= 0; i--){    
            rev = rev + string.charAt(i);    
        }     
        System.out.println(string);  
        System.out.println(rev);    
    }    
}    