import java.util.*;
class HighDigit{
public static void main(String[] args)
{
int n=78759702;
int dig,hig=0;

while(n>0)
{
dig=n%1000;
if(hig<dig&&dig%2!=0)
{
    hig=dig;
}
  n=n/10;
}

System.out.print(hig);
}
}

