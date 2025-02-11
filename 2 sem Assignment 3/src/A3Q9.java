import java.util.*;
public class A3Q9 {
	public static void reverse(int n) {
		if(n < 10) {
			System.out.print(n);
		}else {
			System.out.print(n % 10);
			
			reverse(n / 10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		reverse(n);

	}

}
