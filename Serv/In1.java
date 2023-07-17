import java.util.*;

class Add{
	 void Sum(int n, int m,int n1,int m1){
		int R;
		R=n+n1;
		int Im;
		Im=m+m1;
		System.out.println(R+"+"+Im+"i");
		
	}
}
class Sub{
	 void Minus(int n, int m,int n1,int m1){
		int R;
		R=n-n1;
		int Im;
		Im=m-m1;
		System.out.println(R+"+"+Im+"i");
		
	}
}
class Pro{
	 void Mul(int n, int m,int n1,int m1){
		int R;
		R=(n*n1)-(m*m1);
		int Im;
		Im=(n*m1)+(m*n1);
		System.out.println(R+"+"+Im+"i");
		
	}
}
public class In1 {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int n1=s.nextInt();
		int m1=s.nextInt();
		Add a=new Add();
		a.Sum(n, m,n1,m1);
		Sub ss=new Sub();
		ss.Minus(n,m,n1,m1);
		Pro p=new Pro();
		p.Mul(n, m, n1, m1);
	}

}