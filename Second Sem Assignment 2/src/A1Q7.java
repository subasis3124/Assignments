import java.util.*;
public class A1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of array");
		int a[] = new int[5];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minindex = -1;
		int maxindex = -1;
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			 if (a[i] == min) {
	                minindex = i;  
	            }
	            if (a[i] == max) {
	                maxindex = i;  
	            }
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
			
		}
		
		int occurencemin = countoccurence(a , min);
		int occurencemax = countoccurence(a , max);
		
		System.out.println("minimum value is " + min + " number of occurence is " + occurencemin);
		System.out.println("maximum value is " + max + " number of occurence is " + occurencemax);
		System.out.println("place of occurence of last minimum value " + minindex);
		System.out.println("palce of occurence of first maximum value " + maxindex);
	}
	public static int countoccurence(int[] arr, int target) {
		int count = 0; 
		
		for(int num : arr) {
			if(num == target) {
				count++ ;
			}
		}
		return count;
	}

}
