public class FindIndexStringEquals {

    //Find the Index of the First Occurrence in a String

    class Solution {
        public int strStr(String a, String b) {
            int n=a.length();
            int m=b.length();
       for(int i=0;i<=n-m;i++)
       {
           int j=0;
           while(j<b.length() && a.charAt(i+j)==b.charAt(j) )
           {
              j++;
            }
            if(j==m)
            {
                return i;
            }
       }
       return -1;
        }
    }
}
