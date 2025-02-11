import java.util.*;
public class A6Q1 {
	public static int simpleaddition(int x , int y) {
		return(x + y);
	}public static int simplesubstraction(int x , int y) {
		return(x - y);
	}public static int simplemultiplication(int x , int y) {
		return(x * y);
	}public static double simpledivide(double x , double y) {
		return(x / y);
	}public static double simplereminder(double x , double y) {
		return(x % y);
	}public static double simplesquareroot(double x) {
		return(Math.sqrt(x));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		System.out.println("performing addition");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = simpleaddition(a,b);
		System.out.println(a + "+" + b + "=" + res);
		System.out.println("enter two number");
		System.out.println("performing susbstraction");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sub = simplesubstraction(c,d);
		System.out.println(c + "-" + d + "=" + sub);

		System.out.println("enter two number");
		System.out.println("performing multiplication");
		int e = sc.nextInt();
		int f = sc.nextInt();
		int mul = simplemultiplication(e,f);
		System.out.println(e + "*" + f + "=" + mul);

		System.out.println("enter two number");
		System.out.println("performing divide");
		int g = sc.nextInt();
		int h = sc.nextInt();
		double div = simpledivide(g,h);
		System.out.println(g + "/" + h + "=" + div);

		System.out.println("enter two number");
		System.out.println("performing reminder");
		int i = sc.nextInt();
		int j = sc.nextInt();
		double rem = simplereminder(i,j);
		System.out.println(i + "%" + j + "=" + rem);

		System.out.println("enter two number");
		System.out.println("performing squareroot");
		double k = sc.nextInt();
		double sqrt = simplesquareroot(k);
		System.out.println(" squareroot of k " + "=" + sqrt);


	}

}
