import java.util.Scanner;
public class A4Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a = sc.nextInt();
		int mulp = 1;
		int dig;
		int reg = 0;
		while(a > 0); {
			 dig = a%10;
		}if(dig != 0) {
			reg += mulp * dig;
			mulp *= 100;
		}
		 a = a/10;
		 
		 System.out.println("output" + reg);
		

	}

}
