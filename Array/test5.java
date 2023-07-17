package Array;
import java.util.*;

public class test5
{


static int findValue(int arr[], int n, int k)
{

	boolean exist = true;

	// Search for k. After every successful
	// search, double k and change exist to true
	// and search again for k from the start of array

	while(exist){

	exist = false;

	for (int i = 0; i < n; i++) {

		// Check is a[i] is equal to k
		if (arr[i] == k){
		k *= 2;
		exist = true;
		break;
		}
	}

	}

	return k;
}

// Driver Code
public static void main(String[] args)
{
    Scanner obj = new Scanner(System.in);
    int n= obj.nextInt();
    int k=obj.nextInt();
    int arr[]=new int [n];

    for(int i=0;i<arr.length;i++)
    {
        arr[i]=obj.nextInt();
    }

   
	System.out.print(findValue(arr, n, k));
}
}


