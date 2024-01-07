import java.util.*;
public class Rowman {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();

        int sum=0;
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
      if(c=='I')
        sum+=1;
      else if(c=='V')
        sum+=5;
      else if(c=='X')
        sum+=10;
      else if(c=='L')
        sum+=50;
      else if(c=='C')
        sum+=100;
      else if(c=='D')
        sum+=500;
      else if(c=='M')
        sum+=1000;
     }
     System.out.println(sum);
    }
}
