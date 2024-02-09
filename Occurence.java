import java.util.*;
import java.util.Scanner;
public class Occurence {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String send=sc.nextLine();
		String receive=sc.nextLine();
		char s[]=send.toCharArray();
		char r[]=receive.toCharArray();
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<s.length;j++) {
				if(r[i]==s[i]) {
					s[i]='@';
					break;
				}
			}
		}
		
		for(int i=0;i<s.length;i++) {
			if(s[i]!='@') {
				System.out.print(s[i]);
			}
		}
	}
}