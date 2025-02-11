import java.util.*;
public class A3HW6 {
	public static boolean palindrome( String str) {
		if(str == null || str.length() <= 1) {
			return true;
		}else if( str.charAt(0) == str.charAt(str.length() - 1)) {
			return palindrome(str.substring(1 , str.length() - 1));
		}else {
			return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		System.out.println("is it palindrome  - " + palindrome(str));

	}

}
