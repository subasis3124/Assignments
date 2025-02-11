
import java.util.*;
public class A3Q7 {
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}else {
			return n * fact(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for which you want to count the factorial");
		int n = sc.nextInt();
		//fact(n);
		System.out.println(fact(n));

	}

}
