import java.util.*;
public class A5Q5 {

	public static void main(String[] args) {	
		for(int i = 2; i <= 25; i++) {
			System.out.println("multiplication table of " + i);
			for(int j = 1; j <= 10; j++) {
				int res = i * j;
				System.out.println(i + " X " + j + " = " + res);
			}		
		}
		
		
	}

}
