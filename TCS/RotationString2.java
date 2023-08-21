package TCS;
import java.util.*;


public class RotationString2 {
    public static void main(String args[])
    {
    String a="ABCD";
    String b="CDAB";
    }
    if(isRotation(a,b))
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
    }

}

public static boolean isRotation(String a,String b)
{
    return(a.length()==b.length()) && ((a+b).indexOf(b) != -1);
}




