import java.util.*;
public class A1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		int sum = 0, prod = 1;
		while(n > 0) {
			int a = n % 10;
			sum += a;
			prod *= a;
			n /= 10;
		}
		if(sum == prod) {
			System.out.println("the number is a spy number");
		}else
			System.out.println("not a spy number");

	}

}
