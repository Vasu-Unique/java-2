package Hollow_pattern;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthEditorPaneUI;

public class HollowSquare {
    public static void main (String args[])
    {
        int n=5,i,j;
        for(i=1;i<=n;i++,System.out.println())
        {
            for(j=1;j<=n;j++)
            {
                if (i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        }
    }
}
