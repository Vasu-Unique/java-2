import java.util.*;

public class PigLatin {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String n=obj.nextLine();
        char arr[]=n.toCharArray();
        String b="";
        //char b="e,a,i,o,u";
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u')
            {
                if(arr[j]!='a'||arr[j]!='e'||arr[j]!='i'||arr[j]!='o'||arr[j]!='u')
                {
                    
                }
                System.out.println(n+"-ay");
            }
            if(arr[0]=='a'||arr[0]=='e'||arr[0]=='i'||arr[0]=='o'||arr[0]=='u')
            {
                System.out.println(n+"-yay");
                break;
            }
        }
}
}
