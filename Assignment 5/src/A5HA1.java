import java.util.*;
public class A5HA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= 1; j--) {
				if(j == i) {
					System.out.print(" * ");
				}else
					System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
