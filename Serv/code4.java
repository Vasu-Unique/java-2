class batsman
{
    void bat()
    {
        System.out.println("I am Batsman");
    }
}
class bowler extends batsman {
    void bowl(){
        System.out.println("I am Bowler");
    }
}
class allrounder extends bowler{
    void both(){
        System.out.println("I am Batsman and I am Bowler");
    }
}
public class code4 {
    public static void main(String args[])
    {
        allrounder c =new allrounder();
        c.bat();
        c.bowl();
        c.both();
    }
}
