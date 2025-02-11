import java.util.*;
public class A3HW2 {
	public static int Bsearch(int[] a, int l, int  h ,int item) {
		while(l <= h) {
			int mid = l + (h - l) / 2;
			if(a[mid] == item) {
				return mid;
			}else if (a[mid] > item) {
				return Bsearch(a,l,mid - 1,item);
			}else {
				return Bsearch(a,mid + 1,h,item);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array element");
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int l = 0;
		int h = a.length - 1;
		System.out.println("enter the element of search");
		int item = sc.nextInt();
		System.out.println("element found at index " + Bsearch(a,0,a.length - 1,item));
		

	}

}
