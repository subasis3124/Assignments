import java.util.Scanner;
public class A3HA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		
		int u = sc.nextInt();
		int c = (int) (Math.random() * 3);
				
		if(c == 0 && u == 0) {
		    System.out.println("its a draw ");
		} else if(c == 0 && u == 1) {
			System.out.println("you won");
		}else if(c == 0 && u == 2) {
			System.out.println("comp won");
		}else if(c == 1 && u == 0) {
			System.out.println("comp won");
		}else if(c == 1 && u == 1) {
			System.out.println("its a draw");
		}else if(c == 1 && u == 2) {
			System.out.println("you won");
		}else if(c == 2 && u == 0) {
			System.out.println("you won");
		}else if(c == 2 && u == 1) {
			System.out.println("comp won");
		}else if(c == 2 && u == 2) {
			System.out.println("its a draw");
		}else
			System.out.println("wrong input");
		
		

	}

}
