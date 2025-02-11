import java.util.*;
public class A1HA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your lines");
		int n = sc.nextInt();
		String[]ar = new String[n];
		System.out.println("lines - ");
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextLine();
		}
		System.out.println("after reversing ");
		for(int j = n - 1; j >= 0; j--) {
			System.out.println(ar[j]);
		}

	}

}
