import java.util.*; 
class geeks 
{ 
	public static int sumoflength(int[] arr, int n) 
	{ 
		Set<Integer> s = new HashSet<>(); 
		int j=0, ans=0; 

		for (int i=0;i<n;i++) 
		{ 
			while (j<n && !s.contains(arr[j])) 
			{ 
				s.add(arr[j]); 
				j++; 
			} 
			ans+=((j-i)*(j-i+1))/2; 
			s.remove(arr[i]); 
		} 
		return ans; 
	} 
	public static void main(String[] args) 
	{ 
		Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
        }

		int n = arr.length; 
		System.out.println(sumoflength(arr, n)); 
	} 
} 

