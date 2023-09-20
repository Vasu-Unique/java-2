import java.util.*;

public class ChemicalFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] chemi = new String[N];
        
        for (int i = 0; i < N; i++) {
            chemi[i] = scanner.next();  
        }
        
        int result = Explo(N, chemi);
        System.out.println(result);  
    }
    
    public static int Explo(int N, String[] chemi) {
        int Ecount = 0;
        
        for (int i = 0; i < N; i++) {
            String x = chemi[i];
            int[] fre1 = frecount(x);
            String z = x + x;
            int[] fre2 = frecount(z);
            
            for (int j = i + 1; j < N; j++) {
                String y = chemi[j];
                int[] fre3 = frecount(y);
                
                if (E1(fre2, fre3)) {
                    Ecount++;
                }
            }
        }
        
        return Ecount;
    }
    
    public static int[] frecount(String s) {
        int[] freqCount = new int[26];  
        for (char c : s.toCharArray()) {
            freqCount[c - 'a']++;
        }
        return freqCount;
    }
    
    public static boolean E1(int[] f1, int[] f2) {
        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i]) {
                return false;
            }
        }
        return true;
    }
}
