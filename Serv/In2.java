import java.util.*;

class Bank{
	void getBalance() {
		System.out.println("0");
	}
}
class BankA extends Bank {
	void getBalance(int n) {
		System.out.println(n);
	}
}
class BankB extends Bank{
	void getBalance(int n1) {
		System.out.println(n1);
	}
}
class BankC extends Bank{
	void getBalance(int n2) {
		System.out.println(n2);
	}
}
public class In2 {

	public static void main(String[] args) {
		Scanner sh=new Scanner(System.in);
		int n=sh.nextInt();
		int n1=sh.nextInt();
		int n2 =sh.nextInt();
		Bank bk=new Bank();
		bk.getBalance();
		BankA a=new BankA();
		a.getBalance(n);
		BankB b=new BankB();
		a.getBalance(n1);
		BankC c=new BankC();
		a.getBalance(n2);
	}

}