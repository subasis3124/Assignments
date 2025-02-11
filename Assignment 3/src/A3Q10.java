import java.util.Scanner;
public class A3Q10{
 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the number");
			int m = sc.nextInt();
			m = m/10;
			switch(m) {
			case 9: {
				System.out.println("m >=90");
				System.out.println("o");
				break ;
			}case 8: {
				System.out.println("m>=80 && m<90");
				System.out.println("A");
				break ;
			}case 7: {
				System.out.println("m>=70 && m<80");
				System.out.println("B");
				break ;
			}case 6: {
				System.out.println("m>=60 && m<70");
				System.out.println("C");
				break ;
			}case 5: {
				System.out.println("m>=50 && m<60");
				System.out.println("D");
				break ;
			}case 4: {
				System.out.println("m>=40 && m<50");
				System.out.println("E");
				break ;
			}case 3: 
			case 2 :
			case 1 :
			case 0 :{
				System.out.println(m<=40);
				System.out.println("F");
			}
			
				
			
			}
	}

}
