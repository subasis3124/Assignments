import java.util.Scanner;
public class A5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println(num + " is not a twisted prime number");
        }
        else {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                
                int t = num;
                int rev_Num = 0;
                
                while (t != 0) {
                    int digit = t % 10;
                    t /= 10;
                    rev_Num = rev_Num * 10 + digit;
                }
                
                for (int i = 2; i <= rev_Num / 2; i++) {
                    if (rev_Num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                	System.out.println(num + " is a twisted prime number");
                else
                	System.out.println(num + " is not a twisted prime number");
            }
           
        }
            


	}

}
