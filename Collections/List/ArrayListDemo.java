package Collections.List;
import java.util.*;
//import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        //Declare Arrays List
        //ArrayList obj=new ArrayList();                                //Hetrogenus values and obj is object reference varaiable
        //ArrayList <Integer> obj =new ArrayList<Integer>();           //Homogenus values using wrapper class
        //ArrayList <String> obj= new ArrayList <String>();           //Homogenus values using wrapper class
        //List obj=new ArrayList();                                   //we can also this because this is parent class 
        
        Scanner obj=new Scanner (System.in);
        ArrayList arr=new ArrayList();
        int a=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            arr.add(i,obj.nextInt());
        }
        System.out.println(arr.toString().replace("[","").replace("]","").replace(",",""));
        
    }
}
