import java.util.*;
class ValidateAgeException extends Exception {
	ValidateAgeException(String str) {
		super(str);
	}
}
public class practice1 {
	public static void CheakAge(int age) throws ValidateAgeException {
		if(age < 18) {
			throw new ValidateAgeException("Not elligible to caste vote");
		}else {
			System.out.println("is valid");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int a = sc.nextInt();
		try {
			CheakAge(a);
		}
		catch(ValidateAgeException obj) {
			System.out.println(obj);
		}
		finally {
			sc.close();
		}

	}

}
