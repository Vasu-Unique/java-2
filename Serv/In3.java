import java.util.*;

class Employee{
	void getInfo(int s,int w) {
		System.out.println("Salary:"+s);
		System.out.println("Working per Hour:"+w);
	}

void AddSal(int s) {
	if(s<500) {
		s=s+10;
		System.out.println("The Salary:"+s);
	}
}
void AddWork(int s, int w) {
	if(w>6) {
		s=s+5;
		System.out.println("The Salary:"+s);
	}
}



}
public class In3 extends Employee {

	public static void main(String[] args) {
	Scanner sh=new Scanner(System.in);
	int s=sh.nextInt();
	int w=sh.nextInt();
	In3 ee=new In3();
	ee.getInfo(s, w);
	ee.AddSal(s);
    ee.AddWork(s, w);
	
	}

}