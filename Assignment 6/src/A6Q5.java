import java.util.*;
public class A6Q5 {
	public static double area(int n, double s) {
		return  (n * (s * s)) / (4 * Math.tan(Math.PI / n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of side n ");
		int n = sc.nextInt();
		System.out.println("enter the side");
		double s = sc.nextDouble();
		
		double area = area(n , s);
		
		System.out.println("area of pentagon is " + area);
		

	}

}
