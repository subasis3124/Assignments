// BY SUBASIS MISHRA ,
//REDG NO. - 2341013212 ,
//SECTION 3B1;
import java.util.Scanner;
public class RotateArray {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter number of elements of array:");
		  int n=sc.nextInt();
		  int []array = new int[n];
		  
	      input(array);
	      
		  System.out.println("\nBefore rotation");
		  display(array);
	      binary(array);

	      rotateRightBy2Bits(array);

	      System.out.println("\nAfter rotation");
	      display(array);
	      binary(array);

	  }

	  public static void rotateRightBy2Bits(int[] s) {
	      int n = s.length;
	      int d = 2;
	      int[] temp = new int[n];

	      for (int i = 0; i < n-1; i++) {
	          temp[i+1] = s[i] << (32 - d);
	      }
	      temp[0] = s[n-1] << (32 - d);

	      for (int i = 0; i < n; i++) {
	          s[i] = s[i] >> 2 | temp[i];
	      }
	  }
	  
	  public static void input(int []a) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter array elements");
		  for(int i = 0; i < a.length; i++) {
			  System.out.print("Enter element:");
			  a[i]=sc.nextInt();
		  }
	  }
	  
	  public static void display(int []a) {
		  System.out.print("Array elements are: ");
		  for(int i = 0; i < a.length; i++) {
			  System.out.print(a[i]+" ");
		  }
		  System.out.println();
	  }

	  public static void binary(int[] a) {
	      System.out.print("Decimal: ");
	      for (int i = 0; i < a.length; i++) {
	          System.out.print(a[i] + " ");
	      }

	      System.out.print("\nBinary : ");
	      for (int i = 0; i < a.length; i++) {
	          System.out.print(Integer.toBinaryString(a[i]) + " ");
	      }
	      
	      System.out.println();
	}

}