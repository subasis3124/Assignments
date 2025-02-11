import java.util.*;
public class A3HW5 {
	public static String Rever( String str) {
		if(str == null || str.length() <= 1) {
			return str;
		}else {
			return str.charAt(str.length() - 1) + Rever(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String str = sc.nextLine();
		System.out.println("reverse of the word is " + Rever(str));

	}

}
