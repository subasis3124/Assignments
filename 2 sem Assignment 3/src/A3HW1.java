
import java.util.*;
public class A3HW1 {
	public static int gcd(int a , int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(a, b % a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a = sc.nextInt();
		System.out.println("enter another number");
		int b = sc.nextInt();
		System.out.println(gcd(a,b));

	}

}
