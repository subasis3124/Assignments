import java.util.*;
class deposit {
	long p;
	double r;
	int t;
	double ta;
	
	deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter p r t ");
		long p = sc.nextLong();
		double r = sc.nextDouble();
		int t = sc.nextInt();
	}
	deposit(long p1, int t1, double r1) {
		p = p1;
		r = r1;
		t = t1;
	}
	deposit(long p1, int t1 ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter r");
		p = p1;
		double r = sc.nextDouble();
		t = t1;
		
	}deposit(long p1 , double r1) {
		p = p1;
		r = r1;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
	}
	void display() {
		System.out.println("principal" + p);
		System.out.println("rate " + r);		                             
		System.out.println("time " + t); 
		
	}
	void calcamt() {
		ta =  p + (p * r * t) / 100;
		display();
	}
}
public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		deposit obj = new deposit();
			obj.calcamt();
			//obj.display();
			Scanner sc = new Scanner(System.in);
			long p = sc.nextLong();
			double r = sc.nextDouble();
			int t = sc.nextInt();
		
		deposit obj2 = new deposit(p, t , r); 
			obj2.calcamt();
			//obj2.display();
		
		deposit obj3 = new deposit(p , t) ;
			obj3.calcamt();
			//obj3.display();
		
		deposit obj4 = new deposit(p , r) ;
			obj4.calcamt();
			//obj4.display();
		
	}

}
