import java.util.*;
public class A6Q2 {
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int pent = getPentagonalNumber(n);
		System.out.println("pentagonal number " + n + " is " + pent);

	}

}
