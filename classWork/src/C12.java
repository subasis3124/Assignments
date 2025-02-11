import java.util.*;
class distanc {
	int ft;
	int inch;
	void set_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data");
		ft = sc.nextInt();
		inch = sc.nextInt();
	}
	void display() {
		System.out.println("feet = " + ft + " inches = " + inch);
	}
	distanc sum (distanc d1 , distanc d2) {
		distanc obj = new distanc();
		obj.ft = (d1.ft + d2.ft) / 12;
		obj.inch = (d1.inch + d2.inch) + (d1.ft + d2.ft) % 12;
		return obj;
	}
}
public class C12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		distanc ob1 = new distanc();
		distanc ob2 = new distanc();
		distanc ob3;
		ob1.set_data();
		ob2.set_data();
		ob3 = ob1.sum(ob1,ob2);
		ob1.display();
		ob2.display();
		ob3.display();

	}

}
