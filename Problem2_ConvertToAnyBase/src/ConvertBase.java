// BY SUBASIS MISHRA ,
//REDG NO. - 2341013212 ,
//SECTION 3B1;
import java.util.Scanner;
public class ConvertBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
	           long t=sc.nextLong();
	           
	           
	           if(t <= -128 && t >= 127) {
	               System.out.println(t + "can be stored in " + "byte\n" + "short\n" + "int\n" + "long" );
	           }
	           if(t <= -32768  && t >= 32767) {
	               System.out.println(" can be stored in " + "short\n" + "int\n" + "long"  );
	           }
	           if(t <= -2147483648 && t >= 2147483647){
	               System.out.println(" can be stored in " +  "int\n" + "long"  );
	           }
	           
	           
	           
	           
		sc.close();
	            
	        }

}
}