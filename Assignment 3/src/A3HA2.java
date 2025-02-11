import java.util.Scanner;
public class A3HA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your present day number");
		
		int c = sc.nextInt();
		System.out.println("enter the no. of elapsed day ");
		int f = sc.nextInt();
		
		int cnt = 0;
		String begin = "today is";
		while(cnt<=1) {
		
		switch(c) {
		case 0:
			System.out.println(begin + "sunday");
			break;
		case 1:
			System.out.println(begin + "monday");
			break;
		case 2:
			System.out.println(begin + "tuesday");
			break;
		case 3:
			System.out.println(begin + "wednessday");
			break;
		case 4:
			System.out.println(begin + "thursday");
			break;
		case 5:
			System.out.println(begin + "friday");
			break;
		case 6:
			System.out.println(begin + "saturday");
			break;
			default:
				System.out.println("wrong input");
		}
		 c = c+f;
		 c = (c%7);
		 begin = "the future day is";
		 cnt ++;
		

	}

}
}