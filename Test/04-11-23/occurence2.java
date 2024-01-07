import java.util.*;

public class occurence2 {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            String str = obj.next();
            String substr = obj.next();
            char arr[] = str.toCharArray();
            char array[] = substr.toCharArray();
            String res = "";
            int count = 0;
            for (int i = 0; i < (arr.length - array.length)+1; i++) {
                res=str.substring(i, i+array.length);
                if (res.equals(substr)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

