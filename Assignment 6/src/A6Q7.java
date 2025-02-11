import java.util.*;
public class A6Q7 {
	public static int count(String str) {
		int count  =  0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int vowelc = count(s);
        System.out.println("number of vowel in string " + count(s));
        
        
        
	}

}
