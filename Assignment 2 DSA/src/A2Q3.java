import java.util.*;
class product {
	int prodid;
	int price;
	int quantity;
	static double totalprice = 0;
	product(int p,int pr,int q){
		prodid = p;
		price = pr;
		quantity = q;
	}
	void display() {
		System.out.println(prodid + "  " + price + "  " + quantity + "  ");
	  totalprice   += price * quantity;
	}
}
public class A2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product pro[] = new product[5];
		pro[0] = new product(1,12,14);
		pro[1] = new product(78,32,05);
		pro[2] = new product(69,42,11);
		pro[3] = new product(51,49,94);
		pro[4] = new product(8,45,91);
		System.out.println("Welcome");
		System.out.println("prodid price quantity" );
		for(int i = 0; i < pro.length; i++) {
			pro[i].display();
		}
		System.out.println("total price = " + product . totalprice);
		

	}

}
