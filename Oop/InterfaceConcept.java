package Oop;

interface controll
{
    //abstract public void onleft();
    void left();  // defaultly abtract will come. we does not want to mention the abstract keyword
    void rigth();
    void top();
    void bottom();
}

interface AI { //can extend controll
    
    void onMI();
}

interface mycustomAI
{
    void robotrover();
}

class robot implements controll,AI  //multiple inheritance achieved
{
    public void left()
    {
        System.out.println("Left");
    }
    public void rigth()
    {
        System.out.println("Right");
    }
    public void top()
    {
        System.out.println("Top");
    }
    public void bottom()
    {
        System.out.println("Bottom");
    }
    public void onMI()
    {
        System.out.println("Machine Learning");
    }
}

class AIrobot extends robot implements mycustomAI {//creating another one class using extend and also implement another interface
    
    public void robotrover()
    {
        System.out.println("Rover");
    }
}


public class InterfaceConcept {
    public static void main (String aegs[])
    {
        //control obj=new controll(); //we cannot create obj for interface // but we can create reference
        AIrobot obj=new AIrobot();

    }
}
