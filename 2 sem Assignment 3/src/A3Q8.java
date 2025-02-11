
import java.util.*;
public class A3Q8 {
	public static int power(int a , int b) {
		if(b == 0) {
			return 1;
		}else {
			return a * power(a, b - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base");
		int a = sc.nextInt();
		System.out.println("enter the power");
		int b = sc.nextInt();
		System.out.println("the power is " + power(a,b));
	}

}
