import java.util.*;
public class A6Q3 {
	public static int reverse(int n) {
		int rev = 0;
		while(n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev;
		
	}
	public static boolean isPalindrome(int number) {
		int reversed = reverse(number);
		return number ==  reversed;
		
	}
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		if(isPalindrome(n)) {
			System.out.println(n + " is palindrome ");
		}else
			System.out.println(n + " is not palindrome");
			
			 
		}
	}