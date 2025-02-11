import java.util.*;
public class A1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean ans = isodd(n);
        System.out.println("is the number is odd ? " + ans);
	}public static boolean isodd(int n) {
		
		return (n & 1) == 1;				
	}

}
