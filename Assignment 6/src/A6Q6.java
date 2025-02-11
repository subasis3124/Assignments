import java.util.*;
public class A6Q6 {
	public static int count(String str, char a) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("enter a charecter : ");
		char ch = sc.next().charAt(0);
	    int occur = count(str, ch);
	    System.out.println("no of occurence " + ch + " in the string " + occur);
	    
		

	}

}
