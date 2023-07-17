import java.util.Scanner;
public class count {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int count=0;

        for(int i=0;i<a.length();i++)
        {
            if(a.length()!=0)
            count++;
        }
        System.out.println(count);
    }
}
