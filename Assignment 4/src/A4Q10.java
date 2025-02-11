import java.util.Scanner;
public class A4Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int num1=0,id=0,num2=n,r;
		while(n!=0) {
			r=n%10;
			if(r!=0) {
				num1 = num1+(int)Math.pow(10, id)*r;
				id++;
			}
			n=n/10;
						
			}
		    System.out.println("after removing" + n + "new number" + num1);
		}

	}



