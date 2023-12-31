package Array;

import java.util.*;


class test6 {

	static int minSum(int[] arr, int n)
	{
		int[] dp = new int[n];

		if (n == 1)
			return arr[0];

		if (n == 2)
			return Math.min(arr[0], arr[1]);

		if (n == 3)
		return Math.min(arr[0], Math.min(arr[1], arr[2]));

		if (n == 4)
			return Math.min(Math.min(arr[0], arr[1]),
							Math.min(arr[2], arr[3]));

		dp[0] = arr[0];
		dp[1] = arr[1];
		dp[2] = arr[2];
		dp[3] = arr[3];

		for (int i = 4; i < n; i++)
		dp[i] = arr[i] + Math.min(Math.min(dp[i - 1], dp[i - 2]),
						Math.min(dp[i - 3], dp[i - 4]));

		return Math.min(Math.min(dp[n - 1], dp[n - 2]),
						Math.min(dp[n - 4], dp[n - 3]));
	}

	static public void main(String[] args)
	{
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
       
        int arr[]=new int [n];
    
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
    

		System.out.println(minSum(arr, n));
	}
}



