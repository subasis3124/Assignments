import java.util.Scanner;
public class A4Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int a = sc.nextInt();
		int t = 1;
		while(t<=25) {
			System.out.println(a + "X" + t + "=" + a*t);
			t++;
		}
	}

}
