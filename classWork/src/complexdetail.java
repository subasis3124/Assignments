import java.util.*;
class complex {
	int real;
	int img;
	void setdata(int i,int r) {
		r = real;
		i = img;
	}void display() {
		System.out.println(real + "+" + img + "i" );
	}complex sum(complex c1, complex c2) {
		complex obj = new complex();
		obj.real = c1.real + c2.real;
		obj.img = c1.img + c2.img;
		return obj;
	}
}
public class complexdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter real no.");
		int r = sc.nextInt();
		System.out.println("enter img no.");
		int i = sc.nextInt();
		complex ob1 = new complex();
		ob1.setdata(i, r);
		System.out.println("enter real & img");
		r = sc.nextInt();
		i = sc.nextInt();
		complex ob2 = new complex();
		ob2.setdata(i, r);
		complex ob3 = ob1.sum(ob1,ob2);
		ob1.display();
		ob2.display();
        ob3.display();
	}

}
