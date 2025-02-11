import java.util.*;
public class A3HW3 {
	public static int convo(int n) {
		if(n <= 1) {
			return n;
		}else {
			int ld = n % 10;
			int r = n / 10;
			return ld + 2 * convo(r);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary number ");
		int n = sc.nextInt();
		System.out.println("binary to decimal is " + convo(n));

	}

}
