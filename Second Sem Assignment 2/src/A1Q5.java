import java.util.*;
public class A1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		int sum = sum_of_digits(n);
		System.out.println("the sum is " + sum);

	}
	public static int sum_of_digits(int n) {
		while(n >= 10) {
			int sum = 0;
			while(n > 0) {
				sum += n % 10;
				n /= 10;
			}
			n = sum;
		}
		return n;
		
	}

}
