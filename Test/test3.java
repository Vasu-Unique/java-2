package Test;
import java.util.*;
class test3 {
    public static void main(String[] args) {
  
      String str = "Radar", reverseStr = "";
      int str1 = str.length();
  
      for (int i = (str1 - 1); i >=0; --i) {
        reverseStr = reverseStr + str.charAt(i);
      }
  
      if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
        System.out.println(str+"Palindrome String");
      }
      else {
        System.out.println(str+"not a Palindrome String");
      }
    }
  }
