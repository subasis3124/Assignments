import java.util.*;
public class StackAs {
	public static int maxsize = 10;
public static boolean isEmpty(int top) {
		return top == -1;
}
public static boolean isFull(int top) {
	return top == maxsize - 1;
}
public static int push(int s[], int top) {
	Scanner sc = new Scanner(System.in);
	if(isFull(top)) {
		System.out.println("overflow");
	}else {
		System.out.println("enter element for insert");
		s[++top] = sc.nextInt();
	}
	return top;
}
public static int pop(int s[], int top) {
	if(isEmpty(top)) {
		System.out.println("underflow");
	}else {
		System.out.println("poped element " + s[--top]);
	}
	return top;
}
static void display(int s[], int top) {
	if(isEmpty(top)) {
		System.out.println("Stack is empty");
	}else {
		System.out.println("stack element");
		for(int i = top; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int Stack[] = new int[maxsize];
	        int top = -1;

	        while (true) {
	            System.out.println("****MENU****");
	            System.out.println("0 : EXIT");
	            System.out.println("1 : PUSH");
	            System.out.println("2 : POP");
	            System.out.println("3 : DISPLAY");
	            System.out.println("ENTER YOUR CHOICE");
	            int c = sc.nextInt();
	            switch (c) {
	                case 0:
	                    System.exit(0);
	                    break;
	                case 1:
	                    top = push(Stack, top);
	                    break;
	                case 2:
	                    top = pop(Stack, top);
	                    break;
	                case 3:
	                    display(Stack, top);
	                    break;
	                default:
	                    System.out.println("Invalid response.");
	            }
	        }
	    }
	}


