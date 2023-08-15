import java.util.*;
public class AOccurence {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        String a=obj.nextLine();
        int count=0;
        

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c=='a'||c=='A')
            {
                count++;
            }
            
        }
        System.out.println(count);
}
}