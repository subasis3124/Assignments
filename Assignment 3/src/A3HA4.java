import java.util.Scanner;
public class A3HA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter desire number");
		int n = sc.nextInt();
		System.out.println("is "+n+" divisible by 5 & 6?");
		if(n % 5 == 0 && n % 6 == 0) {
			System.out.println("false");
		}else
			System.out.println("false");
		    System.out.println("is "+n+" divisible by 5 or 6?");
		 if(n % 5 == 0 || n % 6 == 0) {
			System.out.println("true");
		}else
			System.out.println("false");
		 System.out.println("is "+n+" divisible by 5 or 6?");
			if(n % 5 == 0 || n % 6 != 0 || n % 5 != 0 || n % 6 == 0) {
		     System.out.println("true");
		}else
			System.out.println("false");
			
			

	}

}
