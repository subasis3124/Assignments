import java.util.Scanner;
public class A4HA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		
		int N = sc.nextInt();
		String repeat = "1";
		int midValue = 2;
		System.out.println(repeat);
		for (int i = 1; i < N; i++,midValue++) {
            repeat=repeat+" "+midValue+" "+repeat;
            System.out.println(repeat);
        }
		sc.close();
}

		

	}


