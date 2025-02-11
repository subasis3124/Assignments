import java.util.*;
public class A1HA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a ");
		int a = sc.nextInt();
		System.out.println("enter b ");
		int b = sc.nextInt();
		System.out.println("enter c ");
		int c = sc.nextInt();
		if(a + b == c || a == b - c || a * b == c) {
			System.out.println("its a correct arithmetic formula");
		}else {
			System.out.println("not in a correct arithmetic formula ");
		}

	}

}
