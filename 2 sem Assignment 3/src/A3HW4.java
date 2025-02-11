
import java.util.*;
public class A3HW4 {
	public static int prod(int a, int b) {
		if(a == 0 || b == 0) {
			return 0;
		}else if (a == 1) {
			return b;
		}else if (b == 1) {
			return a;
		}else {
			 return a + prod(a, b - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a ");
		int a  = sc.nextInt();
		System.out.println("enter b ");
		int b = sc.nextInt();
		System.out.println("prod of " + a + " X " + b + " = " + prod(a, b));

	}

}
