import java.util.Scanner;
public class fb {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int L=obj.nextInt();
		int N=obj.nextInt();
		int W=obj.nextInt();
		int H=obj.nextInt();
		int D=W*H;
		if(W<L&&H<L)
		{
			System.out.print("Upload Another");
		}
		else if(W==H)
		{
			System.out.print("Accepted");
		}
		else
		{
			System.out.print("Cropit");
		}
		
			}
		}
