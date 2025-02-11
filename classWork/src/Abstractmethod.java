import java.util.*;
abstract class shape {
   abstract void area();
}
class square extends shape {
	void area() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter sides");
	int s = sc.nextInt();
	System.out.println("area = " + s * s);
	}
  }
class triangle extends shape {
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and height");
		int l = sc.nextInt();
		int h = sc.nextInt();
		System.out.println("area = " + 0.5 * l * h);
	}
	
}
class circle extends shape {
	void area() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius");
		int r = sc.nextInt();
		System.out.println("area = " + Math.PI * r * r);
	}
}
public class Abstractmethod {
    public static void main(String [] args) {
    	shape obj = new square();
    	obj.area();
    	obj = new triangle();
    	obj.area();
    	obj = new circle();
    	obj.area();
    	
    }
}
