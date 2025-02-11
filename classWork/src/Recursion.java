import java.util.*;
public class Recursion {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        
        int n = sc.nextInt();
        int factorial = fact(n);
        
        System.out.println("Factorial of " + n + " is " + factorial);
	}
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}else {
			return n * fact(n - 1);
		}
	}
	
	
}
