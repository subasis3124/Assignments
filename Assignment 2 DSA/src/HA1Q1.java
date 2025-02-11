import java.util.*;
class comission {
	double sales;
	comission(double  sales) {
		this.sales = sales;
	}
	public double getcomission() {
		if(sales < 0) {
			System.out.println("invalid input");
		}else if (sales < 100){
			return 0.02 * sales;
		}else if (sales < 5000){
			return 0.05 * sales;
		}else {
			return 0.08 * sales;
		}
	        return sales;
	}
}
public class HA1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sales");
		double sales = sc.nextDouble();
		comission c = new comission(sales);
		double com = c.getcomission();
		if(com > 0)
			System.out.println("your comission is Rs " + com);

	}

}
