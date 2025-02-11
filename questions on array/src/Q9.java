//Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long a[] = new long[30];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < a.length; i++) {
        	a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println("fibonacci series upto 30 is ");
        for(int i = 0; i < a.length; i++) {
        	System.out.println(a[i] + " ");
        }
	}

}
