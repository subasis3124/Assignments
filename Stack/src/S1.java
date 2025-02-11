import java.util.*;
class node {
	int info;
	node link;
	static int top = -1;
	public static boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	public stack(int size) {
		stack = new int(size);
		maxsize = size;
		top = -1;
	}
	public static boolean isFull(int maxsize) {
		if(top == maxsize - 1) {
			return true;
		}else {
			return false;
		}
	}
	public static void push(int x) {
		if(isFull) {
			System.out.println("overflow");
			System.exit(0);
		}else {
			System.out.println("inserting " + x);
			Stack[++x] = x;
		}
	}
}
public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
