/*
Traveler wants to start his/her journey from Pune to Ahmedabad.
 Before starting the journey, he/she uses the GPS system to find all the paths to 
 reach from the source to the destination. He/she will use the smallest or the second 
 smallest path to start the journey. Write a logic to find the smallest and the second 
 smallest distance from the list of all distances.

Input

The first input contains N, the total number of paths from the source to the destination..
 2. The second input contains N sorted integers separated by newline A1, A2... An, representing the 
distance of all paths.

 Output
Output contains two numbers separated by a single space character.

If all paths are equal, then the system should generate a message as "Equal".

If N is less than 2, then the system should generate a message as "Invalid Input".

Constraints

2 <N<= 10

1 <= A[i]<= 1000

Example 1:
INPUT
4
100
400
300
250

Output
100 250

Explanation
Out of the given 4 possible paths, only 100 are the smallest distances to reach the destination

Example 2:
Input
1
200

Output
Invalid Input

 */
import java.util.*;
public class SmallPath {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int arr[]=new int[a];

    for(int i=0;i<a;i++)
    {
        arr[i]=obj.nextInt();
    }
    Arrays.sort(arr);

    if(a>1)
    {
    System.out.println(arr[0]+" "+arr[1]);
    }
    else
    {
        System.out.println("Invalid Input");
    }
    
}
}
