import java.util.Scanner;
public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Testcase");
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            int prev = -1;
            while (true) {
                int maxFreq = 0, maxIndex = -1;
                for (int i = 0; i < 26; i++) {
                    if (freq[i] > maxFreq && i != prev) {
                        maxFreq = freq[i];
                        maxIndex = i;
                    }
                }
                if (maxIndex == -1) {
                    break;
                }
                sb.append((char) (maxIndex + 'a'));
                freq[maxIndex]--;
                prev = maxIndex;
            }
            if (sb.length() < n) {
                System.out.println("-1");
            } else {
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
