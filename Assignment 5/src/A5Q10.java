import java.util.*;
public class A5Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the value of n");
		int n = sc.nextInt();
		int a = 0, b = 1, c = 1;
		System.out.println(a + " " + b + " " + c);
		for(int i = 4; i <= n; i++) {
			int sum = a + b + c;
			System.out.println(sum + " ");
			a = b;
			b = c;
			c = sum;
		}

	}

}
