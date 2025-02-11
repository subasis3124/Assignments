import java.util.*;
public class A5Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of 1st no. ");
		int f = sc.nextInt();
		System.out.println("enter the value of  2nd number ");
		int s = sc.nextInt();
		for(int i = f; i <= s; i++) {
			int fact = 1;
			for(int j = 1; j <= i; j++) {
				fact *= j;
			}
			System.out.println(" factorial " + i + " = " + fact);
		}

	}

}
