//using this keyword

public class ThisKeyword {
    int empid;
    int salary;

    ThisKeyword(int empid,int salary)
    {
        this.empid=empid;
        this.salary=salary;
    }

    void display()
    {
        System.out.println("id: "+empid);
        System.out.println("salary: "+salary);
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(1,100);
        obj.display();
    }
}


// //Invoke the current class constructor
// public class ThisKeyword {
//     int empid;
//     int salary;

//     ThisKeyword(int empid)
//     {
//         this.empid=empid;
//     }

//     ThisKeyword(int empid,int salary)
//     {
//         this(empid);  //this reduce the code
//         this.salary=salary;
//     }

//     void anotherdisplay()
//     {
//         System.out.println("Hi guys");
//     }

//     void display()
//     {
//         System.out.println("id: "+empid);
//         System.out.println("salary: "+salary);
//         this.anotherdisplay();
//     }

//     public static void main(String[] args) {
//         ThisKeyword obj=new ThisKeyword(100);
//         obj.display();
//     }
// }