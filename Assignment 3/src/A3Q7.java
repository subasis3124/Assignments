import java.util.Scanner;
public class A3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the unit");
		
		int u  = sc.nextInt();
		double p = 0;
		
		if (u <= 50) {
			p = u * 3.0;
		}else if (u <= 200) {
			p = u * 5.0 * 3.0 + (u-50) * 4.80;
		}else if (u <= 400) {
			p = u * 5.0 * 3.0 + 150 * 4.80 + (u-200) * 5.80;
		}else  {
			p = u * 5.0 * 3.0 + 150 * 4.80 + 200 * 5.80 + (u-400) * 6.20;
		}
		
		System.out.println("unit " + u);
		System.out.println("price" + p);
		
		System.out.println("want to pay online (y/n)");
		char ch = sc.next().charAt(0);
		if (ch!='n') {
			double disc = p * 3.00/100;
			System.out.println("discount " + disc);
			System.out.println("person will pay =" + (p-disc));
			
		}else {
			System.out.println("payying offline no discount");
			System.out.println("person will play" + p);
		}
		
		

	}

}

