import java.util.*;
class complex {
	double real;
	double img;
	void setdata(double r, double i) {
		real = r;
		img = i;
	}void display() {
		System.out.println(real + "+" + img + "=" + "i");
	}
     complex add(complex n1 , complex n2) {
		complex obj = new complex();
		obj.real = n1.real + n2.real;
		obj.img = n1.img + n2.img;
		return obj;
		
	}
}
public class A2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		complex obj = new complex();
		System.out.println("enter real and imaginary number for c1 ");
		double r = sc.nextDouble();
		double i = sc.nextDouble();
		obj.setdata(r, i);
		complex obj1 = new complex();
		System.out.println("enter real and imaginary number for c2");
		double r2 = sc.nextDouble();
		double i2 = sc.nextDouble();
		obj1.setdata(r, i);
		System.out.println("c1 is " );
		obj.display();
		System.out.println("c2 is " );
		obj1.display();
		System.out.println("sum = ");
		complex obj3 = obj.add(obj,obj1);
		obj3.display();
		

	}

}
