/*

 * Write a program to calculate Maximum number of handshakes
Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.
For e.g.
If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0
Input
10
Output
45

 */

import java.util.*;
public class HandShake {
    public static void  main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int total = n*(n-1)/2;
        System.out.println(total);
    }

    
}
