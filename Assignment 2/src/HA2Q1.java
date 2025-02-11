
public class HAQ1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		
		double si = (p * r * t) / 100;
	
		System.out.println("principal  " + p);
		System.out.println("rate  " + r);
		System.out.println("time  " + t);
		System.out.println("simple interest " + si);
	}

}
