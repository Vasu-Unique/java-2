
class pattern
{ 
    public static void main(String args[]) 
    { 
        for(int a=5;a>=1;a--) 
        { 
            for(int b=5;b>=1;b--) 
            { 
                if(a>=b) 
                { 
                    System.out.print(a); 
                } 
                else 
                { 
                    System.out.print(b); 
                } 
            } 
            System.out.println(); 
        } 
    } 
}