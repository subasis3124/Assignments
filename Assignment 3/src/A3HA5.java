import java.util.Scanner;
public class A3HA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("gender is (f or m) ?");
		char g = sc.next().charAt(0);
		System.out.println("enter first name");
		String fn = sc.next();
		System.out.println("enter last name");
		String ln = sc.next();
		System.out.println("age");
		int a = sc.nextInt();
		if(g=='f') {
		    if(a>20);
		    System.out.println("are you married " + fn + " ( y or n)");
		    char m = sc.next().charAt(0);
		    if (m == 'y') {
		    	System.out.println("then i should call you mrs. " + fn + "  " + ln + ".");
		    }else {
		    	System.out.println("then i shall call u ms. " + fn + ".");
		    }
		} else {
			System.out.println("then i shall call you." + fn + "  " + ln + ".");
		}
	  if (g == 'm');
	  else if (a >= 20) {
			System.out.println("then i shall call u mr." + fn + ".");
		}else  {
			System.out.println("then i should call you mrs. " + fn + "  " + ln + ".");
		}
	 
		
			

	}

}
