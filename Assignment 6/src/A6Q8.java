import java.util.*;
public class A6Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s = sc.nextLine();
		if (isPalindrome(s)) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
	
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
   }

		

	


