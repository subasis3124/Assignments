import java.util.Random;
import java.util.Scanner;
public class A3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your desired number : ");
		int n = sc.nextInt();
		Random r = new Random();
		
		if(true) {
		int random = r.nextInt(9) + 1;
		
		System.out.println("computer guess " + random);
		
		if(n == random) {
			System.out.println("“You got it right”");
	}   else if(n == random + 1) {
		    System.out.println("almost get it");
	}   else {
		    System.out.println("you are wrong");
	}
		

		}
	}
}


