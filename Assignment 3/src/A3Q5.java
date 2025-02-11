import java.util.Scanner;
public class A3Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		
		int ly = sc.nextInt();
		
		if((ly % 400 == 0) || (ly % 100 != 0) && (ly % 4 == 0)) {
		System.out.println(ly  + "is leap year true");
		}else
			System.out.println(ly  + "is not a leap year false");

	}

}
