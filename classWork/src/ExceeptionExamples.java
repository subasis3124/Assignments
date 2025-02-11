/* By -
 * Subasis Mishra
 * 28
 * 2341013212
 */

public class ExceeptionExamples {
	int a = 10, b = 0, c = 0;
	try {
		c = a / b;
	}
	catch(ArithmeticException obj) {
		System.out.println(obj);
	}
	System.out.println("c");
	System.out.println("Rest of code ");
}
}
