import java.util.*;
public class A1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mass");
		double m = sc.nextDouble();
		System.out.println("enter the height");
		double h = sc.nextDouble();
		double bmi = ((m) / (h * h));
		if(bmi < 18.5) {
			System.out.println("the person is under weight");
		}else if(bmi < 24.8) {
			System.out.println("the person is normal weight");
		}else if(bmi < 29.9) {
			System.out.println("the person is overweight");
		}else
			System.out.println("obese");
		 

	}

}
