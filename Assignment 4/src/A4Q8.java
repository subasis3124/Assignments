import java.util.Scanner;
public class A4Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
		    System.out.println("enter ur number");
		    int gues = 0 + (int)(Math.random()) + (100 - 1);
		    int uges = sc.nextInt();
		
		
			if(gues < uges) {
				System.out.println("itss too high!! try once more");
			}else if(gues > uges) {
				System.out.println("its too low!! try once more");
			}else {
				System.out.println("good guess");
			}
				
			
	            
				
			
				 
					
		}			
		
		}
		
	}	

	


