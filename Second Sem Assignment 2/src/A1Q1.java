
import java.util.*;
public class A1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		int c = 0;
		while(n > 2) {
			n /= 2;
			c++;
		}
		System.out.println("count = " + c);
		
		
	}

}
