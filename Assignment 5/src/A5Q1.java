import java.util.Scanner;
public class A5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st num");
		int a = sc.nextInt();
		System.out.println("enter 2nd number");
		int b = sc.nextInt();
		int s1 = 0;
		int s2 = 0;
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				s1 += i;
			}
		}for(int j = 1; j < b; j++) {
			if(b % j == 0) {
				s2 += j;
			}
		}if(s1 == b && s2 == a) {
			System.out.println("its a amicable number");
		}else 
			System.out.println("not a amicable number");

	}

}
