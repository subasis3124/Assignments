import java.util.Scanner;
public class A3Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a >= b && a >= c) {
			System.out.println("a is greatest among all");
			if(b>=c)
				System.out.println("2nd largest is b");
			else
				System.out.println("2nd largest is c");
		}else if(b>=c && b>=a) {
			System.out.println("b is 2nd greatest among all");
			if(a>c)
				System.out.println(" 2nd largest is a");
			else
				System.out.println("2nd largest is c");
		}else {
			System.out.println("c is largest among all");
			if(a>b)
				System.out.println("2nd largest is a ");
			else
				System.out.println("2nd largest is b");
		
	}

	}
}
