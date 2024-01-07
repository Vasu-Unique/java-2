import java.util.*;
public class BreakinBad {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a="BreakingBad";
        String[] b =new String[a.length()];
        for (int i = 0; i < a.length(); i++)
        {
            char ch = a.charAt(i);
            if (Character.isUpperCase(ch))
            {
                String c=b[0];
            }
            else{
                String c=b[0];
            }
            

        }


       // String[] b=a.split("(?=[A-Z])");
        
        String d=b[1];
        int max= Math.max(c.length(),d.length());

        for(int i=0;i<max;i++)
        {
            for(int j=0;j<=i && j!=c.length();j++)
            {
                System.out.print(c.charAt(j));
            }
            for(int k=0;k<=i && k!=d.length();k++)
            {
                System.out.print(d.charAt(k));
            }
        System.out.println();
        }
        
    }
    
}

puts "Enter a string:"
a = gets.chomp

b = a.split(/(?=[A-Z])/)
c = b[0]
d = b[1]

max_length = [c.length, d.length].max

(0...max_length).each do |i|
  (0..i).each do |j|
    print c[j] unless j >= c.length
  end
  (0..i).each do |k|
    print d[k] unless k >= d.length
  end
  puts
end