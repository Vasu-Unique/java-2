import java.util.*;
class row_col
{
    public static void main (String[] args)
    {
        int num, row, col;
        Scanner obj = new Scanner (System.in);
        num = obj.nextInt();

        for(row=1;row<=num;row++,System.out.print("\n"))
        {
            for(col=1;col<=num;col++)
            {
            System.out.print(row%2);
            }
        }
    }
}