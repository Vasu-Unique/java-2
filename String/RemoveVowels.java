package String;
import java.util.*;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        String s = obj.nextLine();
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]", ""); 
        s1.toUpperCase();
        System.out.println("String after removing vowel : "+s1); 
	}

}

