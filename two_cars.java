/*
 * There are two cars-one running with petrol and other running with diesel with following information:
                                                    Petrol        diesel
Distance/Liter in kilometers/liter: (A)                A1               A2

Fuel-cost/Liter: (B)                                   B1               B2

Showroom Price: (C )                                   C1               C2

Average Monthly Run in kilometers: (D)                 D1               D2

Maintenance Cost per month: (E)                        E1               E2

We need to find out which car has the lowest total cost, aver a horizon of 60 months.

Constraints
1 <A <= 50

1<B<=100

10^5<C<= 10^9

1<D<10^4

1<E<= 10^4


- Input
The input has 10 lines, with each line containing one integer

The first line contains an integer A1 denoting distance/Liter (Mileage) for petrol car
The second line contains an-integer B1 denoting fuel-cost/Liter for petrol 

The third line contains an integer C1 denoting showroom Price for petrol 

The fourth line contains an integer D1 denoting average Monthly Run in kilometres for petrol car 

 The fifth line contains an integer E1 denoting maintenance Cost per month for petrol car 

The sixth line contains an integer A2 denoting distance/Liter (Mileage) fo The seventh line contains an integer B2 denoting fuel-cost/Liter for diesel car

The eighth line contains an integer C2 denoting showroom Price for diese The ninth line contains an integer D2 denoting average Monthly Run in kilometres for diesel car 

The tenth line contains an integer E2 denoting maintenance Cost per month for diesel car 
Output
Print "petrol" if petrol car is more cost efficient or print "diesel" if diesel car is more cost efficient.

 */
import java.util.*;
public class two_cars {
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System.in);
        int a1=obj.nextInt();
        int b1=obj.nextInt();
        int c1=obj.nextInt();
        int d1=obj.nextInt();
        int e1=obj.nextInt();
        int a2=obj.nextInt();
        int b2=obj.nextInt();
        int c2=obj.nextInt();
        int d2=obj.nextInt();
        int e2=obj.nextInt();

        int a=c1+(d1/a1)*60+e1*60;
        int b=c2+(d2/a2)*60+e2*60;
        
        if(a>b)
        {
            System.out.println("Disel");
        }
        else
        {
            System.out.println("Petrol");
        }
            
    }
}
