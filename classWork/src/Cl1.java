import java.util.*;
class distance {
	int cm;
	int m;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cm");
		cm = sc.nextInt();
		System.out.println("enter m");
		m = sc.nextInt();
	}
	void display() {
		System.out.println("distance " + cm);
		System.out.println("distance " + m);
	}
	distance sum(distance d1, distance d2) {
		distance obj = new distance();
		obj.cm = (d1.cm + d2.cm) % 100;
		obj.m = (d2.m + d2.cm) + (d1.cm + d2.cm) / 100;
		return obj;
	}
}
public class Cl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		distance ob1 = new distance();
		distance ob2 = new distance();
		distance ob3;
		ob1.getdata();
		ob2.getdata();
		ob3 = ob1.sum(ob1,ob2);
		ob1.display();
		ob2.display();
		ob3.display();

	}

}
